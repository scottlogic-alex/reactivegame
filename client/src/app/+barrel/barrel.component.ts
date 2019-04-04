import {
  Component,
  OnInit,
  OnDestroy,
  ElementRef,
  ViewChild,
  HostListener
} from "@angular/core";
import {
  interval,
  Subject,
  BehaviorSubject,
  Observable,
  animationFrameScheduler
} from "rxjs";
import {
  takeUntil,
  bufferCount,
  distinctUntilChanged,
  withLatestFrom,
  map,
  startWith,
  take,
  filter,
  windowTime,
  mergeAll,
  combineAll,
  tap
} from "rxjs/operators";
import {
  WebSocketSubject,
  webSocket,
  WebSocketSubjectConfig
} from "rxjs/websocket";
/**
 * We're loading this component asynchronously
 * We are using some magic with es6-promise-loader that will wrap the module with a Promise
 * see https://github.com/gdi2290/es6-promise-loader for more info
 */

console.log("`Barrel` component loaded asynchronously");

@Component({
  selector: "barrel",
  template: `
    <h1>Hello from Barrel</h1>
    <span>
      <a [routerLink]="['./child-barrel']">
        Child Barrel
      </a>
    </span>
    <div>{{ this.X }}, {{ this.Y }}</div>
    <canvas
      #myCanvas
      width="1000"
      height="800"
      style="border:1px solid"
    ></canvas>
    <pre>{{ gameStates$ | async | json }}</pre>
    <router-outlet></router-outlet>
  `
  // <button (click)="getColour()">change colour!</button>
})
export class BarrelComponent implements OnInit, OnDestroy {
  private clientWebSocket$: WebSocketSubject<string>;
  private readonly destroy$: Subject<void> = new Subject<void>();
  private readonly collision$: Subject<ICollision> = new Subject<ICollision>();

  @ViewChild("myCanvas", { read: ElementRef }) myCanvas: IElementRef<
    HTMLCanvasElement
  >;
  public context: CanvasRenderingContext2D;

  ngAfterViewInit(): void {
    this.context = this.myCanvas.nativeElement.getContext("2d");
  }

  private draw(colour, position, transparency: number) {
    const { left, top } = this.myCanvas.nativeElement.getBoundingClientRect();
    this.context.globalAlpha = transparency;
    this.context.beginPath();
    this.context.lineWidth = 2;
    this.context.arc(
      position.x - left,
      position.y - top - window.scrollY,
      10,
      0,
      2 * Math.PI
    );
    this.context.strokeStyle = colour;
    this.context.stroke();
    this.context.fillStyle = colour;
    this.context.fill();
  }

  private drawCollsion(position: IPosition) {
    const { left, top } = this.myCanvas.nativeElement.getBoundingClientRect();
    const imgSrc = "../../../assets/img/explosion.png";
    this.context.globalAlpha = 1;
    var img = new Image();
    img.src = imgSrc;
    this.context.drawImage(
      img,
      position.x - left - 50,
      position.y - top - window.scrollY - 50,
      100,
      100
    );
  }

  private stringtoCoords(str: string): IPosition {
    const [x, y] = str.split(",");
    return { x: +x, y: +y };
  }

  @ViewChild("pre", { read: ElementRef })
  private pre: IElementRef<HTMLPreElement>;
  public gameStates$: Subject<IGameState> = new BehaviorSubject<IGameState>({
    playerStates: []
    // collision: { x: -100, y: -100 }
  });

  private coordRegex: RegExp = /^([\w-]+), (#[A-Z\d]{6}), ([\d,_]+)$/;

  @HostListener("mousemove", ["$event"])
  onMousemove(event: MouseEvent) {
    this.mouseEvents$.next({ x: event.clientX, y: event.clientY });
  }

  private mouseEvents$: Subject<IPosition> = new Subject<IPosition>();

  public ngOnInit() {
    const config: WebSocketSubjectConfig<string> = {
      url: "ws://ws00100:8080/wut",
      deserializer: (e: MessageEvent) => e.data
    };
    this.clientWebSocket$ = webSocket(config);
    this.mouseEvents$.next({ x: 0, y: 0 });
    this.clientWebSocket$.pipe(takeUntil(this.destroy$)).subscribe(
      msg => {
        // console.log(msg);
        const sections = msg.split("/");
        if (sections.length === 2) {
          const [playerStates, collisions] = sections;
          // console.log(collisions);
          const bang = this.stringtoCoords(collisions);
          let users = playerStates.split(":");
          let game: IGameState = {
            playerStates: users
              .map(
                (user): RegExpExecArray | null => {
                  // console.log(user);
                  return this.coordRegex.exec(user);
                }
              )
              .filter(match => match !== null)
              .map(
                (match): IPlayerState => {
                  const [, username, colour, positionsString] = match;
                  return {
                    username,
                    position: positionsString
                      .split("_")
                      .map(str => this.stringtoCoords(str)),
                    colour
                  };
                }
              )
            // collision: bang
          };
          this.gameStates$.next(game);
          if (bang.x !== -100 && bang.y !== -100) {
            this.collision$.next({ position: bang });
          }
        }
      },
      err => {
        console.error(err);
      },
      () => {
        console.warn("closing connection");
      }
    );

    interval(0, animationFrameScheduler)
      .pipe(
        withLatestFrom(
          this.gameStates$.pipe(distinctUntilChanged()),
          this.collision$.pipe(
            startWith({ position: { x: 0, y: 0 } })
            // map(collision => {
            //   return interval(1000).pipe(
            //     startWith(0),
            //     map(tick => collision),
            //     take(2)
            //   );
            // }),
            // windowTime(1000),
            // tap(window => {
            //   console.log(window);
            // })
            // combineAll()
          )
        ),
        takeUntil(this.destroy$)
      )
      .subscribe(
        ([, gameState, collision]: [never, IGameState, ICollision]) => {
          // console.log(gameState);
          this.context.clearRect(0, 0, 1000, 800);
          gameState.playerStates.forEach(playerState => {
            let colour = playerState.colour;
            playerState.position.forEach((coords, idx) => {
              this.draw(colour, coords, idx / 10);
            });
          });
          // collisions.forEach(collision => {
          this.drawCollsion(collision.position);
          // });
        }
      );

    this.mouseEvents$
      .pipe(
        distinctUntilChanged(
          (a: IPosition, b: IPosition) => a.x === b.x && a.y === b.y
        ),
        takeUntil(this.destroy$)
      )
      .subscribe(position => {
        const {
          left,
          top
        } = this.myCanvas.nativeElement.getBoundingClientRect();
        if (
          position.x < left + 1000 &&
          position.x > left &&
          position.y < top + 800 &&
          position.y > top
        ) {
          this.clientWebSocket$.next(
            `X: ${position.x}, Y: ${position.y + window.scrollY}`
          );
        }
      });
  }

  public ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
}

interface IElementRef<T> extends ElementRef {
  nativeElement: T;
}

interface IPosition {
  x: number;
  y: number;
}

interface IPlayerState {
  username: string;
  position: Array<IPosition>;
  colour: string;
}

interface IGameState {
  playerStates: Array<IPlayerState>;
}

interface ICollision {
  position: IPosition;
}
