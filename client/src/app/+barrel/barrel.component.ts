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
  animationFrameScheduler
} from "rxjs";
import {
  takeUntil,
  distinctUntilChanged,
  withLatestFrom,
  retry
} from "rxjs/operators";
import {
  WebSocketSubject,
  webSocket,
  WebSocketSubjectConfig
} from "rxjs/websocket";
import { AppState } from "../app.service";
/**
 * We're loading this component asynchronously
 * We are using some magic with es6-promise-loader that will wrap the module with a Promise
 * see https://github.com/gdi2290/es6-promise-loader for more info
 */

console.log("`Barrel` component loaded asynchronously");
@Component({
  templateUrl: "./barrel.component.html",
  styleUrls: ["./barrel.component.css"]
})
export class BarrelComponent implements OnInit, OnDestroy {
  constructor(private appService: AppState) {}

  private clientWebSocket$: WebSocketSubject<string>;
  private readonly destroy$: Subject<void> = new Subject<void>();
  private readonly collision$: Subject<ICollision> = new Subject<ICollision>();
  private readonly collisions: Set<ICollision> = new Set<ICollision>();
  public width: number = 2000;
  public height: number = 1000;
  public color: string = "";
  public username: string = "";

  @ViewChild("myCanvas", { read: ElementRef }) myCanvas: IElementRef<
    HTMLCanvasElement
  >;
  public context: CanvasRenderingContext2D;

  ngAfterViewInit(): void {
    this.context = this.myCanvas.nativeElement.getContext("2d");
  }

  public changeColour() {
    console.log(this.color);
    this.appService
      .updateColour(this.color)
      .subscribe(/*response => console.log(response)*/);
  }

  public setUsername() {
    console.log(this.username);
    this.appService.updateUsername(this.username).subscribe();
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
    this.context.strokeStyle = "black";
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

  private drawEyes(position: IPosition) {
    const { left, top } = this.myCanvas.nativeElement.getBoundingClientRect();
    const imgSrc = "../../../assets/img/googlyEyes.png";
    this.context.globalAlpha = 1;
    var img = new Image();
    img.src = imgSrc;
    this.context.drawImage(
      img,
      position.x - left - 20,
      position.y - top - window.scrollY - 20,
      40,
      40
    );
  }

  private stringtoCoords(str: string): IPosition {
    const [x, y] = str.split(",");
    return { x: +x, y: +y };
  }

  private tooSlow(oldPosition: IPosition, newPosition: IPosition): boolean {
    return (
      (oldPosition.x - newPosition.x) ** 2 +
        (oldPosition.y - newPosition.y) ** 2 <
      20 ** 2
    );
  }

  @ViewChild("pre", { read: ElementRef })
  private pre: IElementRef<HTMLPreElement>;
  public gameStates$: Subject<IGameState> = new BehaviorSubject<IGameState>({
    playerStates: []
  });

  // private coordRegex: RegExp = /^([\w- ]+), (#[A-Za-z\d]{6}), ([\d,_]+)$/;

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
        let gameState = JSON.parse(msg);
        let game: IGameState = {
          playerStates: gameState.playerStates.map(playerState => {
            let ps: IPlayerState = {
              username: playerState.username,
              position: playerState.positions,
              colour: playerState.colour
            };
            return ps;
          })
        };
        let bang = gameState.recent;
        this.gameStates$.next(game);
        if (bang.x !== -100 && bang.y !== -100) {
          this.collision$.next({ position: bang });
        }
      },
      err => {
        console.error(err);
      },
      () => {
        console.warn("closing connection");
        retry();
      }
    );

    this.collision$.pipe().subscribe(collision => {
      this.collisions.add(collision);
      setTimeout(() => {
        this.collisions.delete(collision);
      }, 100);
    });

    interval(0, animationFrameScheduler)
      .pipe(
        withLatestFrom(this.gameStates$.pipe(distinctUntilChanged())),
        takeUntil(this.destroy$)
      )
      .subscribe(([, gameState]: [never, IGameState]) => {
        this.context.clearRect(0, 0, this.width, this.height);
        gameState.playerStates.forEach(playerState => {
          let colour = playerState.colour;
          playerState.position.forEach((coords, idx) => {
            this.draw(colour, coords, idx / 4);
          });
          if (playerState.position.length)
            this.drawEyes(
              playerState.position[playerState.position.length - 1]
            );
        });
        this.collisions.forEach(collision => {
          this.drawCollsion(collision.position);
        });
      });

    this.mouseEvents$
      .pipe(
        distinctUntilChanged((a: IPosition, b: IPosition) =>
          this.tooSlow(a, b)
        ),
        takeUntil(this.destroy$)
      )
      .subscribe(position => {
        const {
          left,
          top
        } = this.myCanvas.nativeElement.getBoundingClientRect();
        if (
          position.x < left + this.width &&
          position.x > left &&
          position.y < top + this.height &&
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
