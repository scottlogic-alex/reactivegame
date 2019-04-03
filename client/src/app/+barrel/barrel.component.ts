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
  withLatestFrom
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

  @ViewChild("myCanvas", { read: ElementRef }) myCanvas: IElementRef<
    HTMLCanvasElement
  >;
  public context: CanvasRenderingContext2D;

  ngAfterViewInit(): void {
    this.context = this.myCanvas.nativeElement.getContext("2d");
  }

  private draw({ colour, position: { x, y } }: Partial<IPlayerState>) {
    const { left, top } = this.myCanvas.nativeElement.getBoundingClientRect();
    this.context.beginPath();
    this.context.arc(x - left, y - top, 10, 0, 2 * Math.PI);
    this.context.strokeStyle = colour;
    this.context.stroke();
    // this.context.fillStyle = colour;
    // this.context.fill();
  }

  @ViewChild("pre", { read: ElementRef })
  private pre: IElementRef<HTMLPreElement>;
  public gameStates$: Subject<IGameState> = new BehaviorSubject<IGameState>({
    playerStates: []
  });

  private coordRegex: RegExp = /^([\w-]+), (#[A-Z\d]{6}), (\d+), (\d+)$/;

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

    this.clientWebSocket$.pipe(takeUntil(this.destroy$)).subscribe(
      msg => {
        let users = msg.split(":");
        let game: IGameState = {
          playerStates: users
            .map(
              (user): RegExpExecArray | null => {
                return this.coordRegex.exec(user);
              }
            )
            .filter(match => match !== null)
            .map(
              (match): IPlayerState => {
                const [, username, colour, x, y] = match;
                return {
                  username,
                  position: { x: +x, y: +y },
                  colour
                };
              }
            )
        };
        this.gameStates$.next(game);
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
          this.gameStates$.pipe(
            bufferCount(10, 1),
            distinctUntilChanged()
          )
        ),
        takeUntil(this.destroy$)
      )
      .subscribe(([, gameState]) => {
        this.context.clearRect(0, 0, 1000, 800);
        gameState.forEach(ps => {
          ps.playerStates.forEach(ps => {
            this.draw(ps);
          });
        });
      });

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
          this.clientWebSocket$.next(`X: ${position.x}, Y: ${position.y}`);
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
  position: IPosition;
  colour: string;
}

interface IGameState {
  playerStates: Array<IPlayerState>;
}
