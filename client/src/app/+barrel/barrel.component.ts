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
  animationFrameScheduler,
  Observable,
  forkJoin,
  combineLatest
} from "rxjs";
import {
  takeUntil,
  distinctUntilChanged,
  withLatestFrom,
  retry,
  throttleTime,
  tap,
  switchMapTo,
  map
} from "rxjs/operators";
import {
  WebSocketSubject,
  webSocket,
  WebSocketSubjectConfig
} from "rxjs/websocket";
import { AppState } from "../app.service";
import { IAsset, assets, KeyedImage, LoadedImages, AssetTypes } from "../asset";
import { IUser } from "app/user";
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
  private readonly apples$: Subject<IPosition> = new Subject<IPosition>();
  private readonly hats$: Subject<IHat> = new Subject<IHat>();
  private apple: IPosition;
  private hat: IHat;
  public width: number = 2000;
  public height: number = 1000;
  public color: string = "";
  public username: string = "";
  private winner: IPlayerState = {
    username: null,
    positions: [],
    colour: null,
    points: 0,
    hat: ""
  };
  public assets = assets;

  @ViewChild("myCanvas", { read: ElementRef }) myCanvas: IElementRef<
    HTMLCanvasElement
  >;
  public context: CanvasRenderingContext2D;

  ngAfterViewInit(): void {
    this.context = this.myCanvas.nativeElement.getContext("2d");
  }

  public changeColour() {
    this.appService.updateColourByCookieId(this.color).subscribe();
  }

  public setUsername() {
    this.appService.updateUsernameByCookieId(this.username).subscribe();
  }

  private draw(colour, position, transparency: number) {
    this.context.globalAlpha = transparency;
    this.context.beginPath();
    this.context.lineWidth = 2;
    this.context.arc(position.x, position.y, 10, 0, 2 * Math.PI);
    this.context.strokeStyle = "black";
    this.context.stroke();
    this.context.fillStyle = colour;
    this.context.fill();
  }

  private drawCustom(
    position: IPosition,
    image: IAsset,
    imageSource: HTMLImageElement
  ) {
    this.context.globalAlpha = 1;
    this.context.drawImage(
      imageSource,
      position.x - image.xAdjust,
      position.y - image.yAdjust,
      image.width,
      image.height
    );
  }

  private writeName(position: IPosition, name: string) {
    this.context.font = "25px Arial";
    this.context.fillStyle = "white";
    this.context.fillText(name, position.x, position.y - 70);
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

  @HostListener("mousemove", ["$event"])
  onMousemove(event: MouseEvent) {
    this.mouseEvents$.next({ x: event.clientX, y: event.clientY });
  }

  private mouseEvents$: Subject<IPosition> = new Subject<IPosition>();

  public ngOnInit() {
    console.log("hello");
    const config: WebSocketSubjectConfig<string> = {
      url: "ws://ws00100:8080/wut",
      deserializer: (e: MessageEvent) => e.data
    };
    this.clientWebSocket$ = webSocket(config);
    this.mouseEvents$.next({ x: 0, y: 0 });

    const images$: Observable<LoadedImages> = forkJoin(
      Object.entries(this.assets).map(([key, asset]: [AssetTypes, IAsset]) =>
        this.appService.getImage(asset.url).pipe(
          map(
            (element: HTMLImageElement): KeyedImage => ({
              key,
              element
            })
          )
        )
      )
    ).pipe(
      map(
        (keyedImages: KeyedImage[]): LoadedImages =>
          keyedImages.reduce(
            (
              acc: Partial<LoadedImages>,
              image: KeyedImage
            ): Partial<LoadedImages> => {
              acc[image.key] = image.element;
              return acc;
            },
            {}
          ) as LoadedImages
      )
    );

    this.appService
      .getUserByCookieId()
      .pipe(
        tap((user: IUser) => {
          console.log(user);
          this.color = user.colour;
          this.username = user.name;
        }),
        switchMapTo(this.clientWebSocket$),
        takeUntil(this.destroy$)
      )
      .subscribe(
        (msg: string) => {
          let gameState = JSON.parse(msg);
          let game: IGameState = {
            playerStates: gameState.playerStates
          };
          let bang = gameState.recent;
          this.apples$.next(gameState.apple);
          this.hats$.next(gameState.hat);
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

    this.apples$.pipe().subscribe(apple => {
      this.apple = apple;
    });

    this.hats$.pipe().subscribe(hat => {
      this.hat = hat;
      // console.log(this.hat);
    });

    interval(0, animationFrameScheduler)
      .pipe(
        withLatestFrom(this.gameStates$.pipe(distinctUntilChanged()), images$),
        takeUntil(this.destroy$)
      )
      .subscribe(
        ([, gameState, loadedImages]: [never, IGameState, LoadedImages]) => {
          this.context.clearRect(0, 0, this.width, this.height);
          gameState.playerStates.forEach(playerState => {
            let colour = playerState.colour;
            playerState.positions.forEach((coords, idx) => {
              this.draw(colour, coords, idx / 4);
            });
            if (playerState.positions.length) {
              this.drawCustom(
                playerState.positions[playerState.positions.length - 1],
                this.assets.Eyes,
                loadedImages.Eyes
              );
              if (playerState.hat) {
                this.drawCustom(
                  playerState.positions[playerState.positions.length - 1],
                  assets[playerState.hat],
                  loadedImages[playerState.hat]
                );
              }
              this.writeName(
                playerState.positions[playerState.positions.length - 1],
                `${playerState.username}: ${playerState.points}`
              );
            }
          });
          if (gameState.playerStates.length > 1) {
            this.winner = gameState.playerStates.reduce((currentBest, worm) => {
              if (worm.points > currentBest.points) {
                return worm;
              }
              return currentBest;
            }, this.winner);

            let winner = gameState.playerStates
              .filter(worm => worm.positions.length === 10)
              .sort((a, b) => b.points - a.points);
            if (winner && winner.length) {
              this.drawCustom(
                winner[0].positions[9],
                assets.Crown,
                loadedImages.Crown
              );
            }
          }

          this.collisions.forEach(collision => {
            this.drawCustom(
              collision.position,
              assets.Collision,
              loadedImages.Collision
            );
          });
          if (this.apple)
            this.drawCustom(this.apple, assets.Apple, loadedImages.Apple);
          // if (this.hat) this.drawCustom(this.hat.position, assets[this.hat.type]);
        }
      );

    this.mouseEvents$
      .pipe(
        distinctUntilChanged((a: IPosition, b: IPosition) =>
          this.tooSlow(a, b)
        ),
        throttleTime(10),
        takeUntil(this.destroy$)
      )
      .subscribe(position => {
        const {
          left,
          top
        } = this.myCanvas.nativeElement.getBoundingClientRect();
        let height = this.myCanvas.nativeElement.clientHeight;
        let width = this.myCanvas.nativeElement.clientWidth;
        let x = Math.round(position.x - left);
        let y = Math.round(position.y - top);
        if (
          position.x < left + width &&
          position.x > left &&
          position.y < top + height &&
          position.y > top
        ) {
          this.clientWebSocket$.next(
            `X: ${Math.round(x * (this.width / width))}, Y: ${Math.round(
              y * (this.height / height)
            )}`
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
  positions: Array<IPosition>;
  colour: string;
  points: number;
  hat: string;
}

interface IGameState {
  playerStates: Array<IPlayerState>;
}

interface ICollision {
  position: IPosition;
}

interface IHat {
  position: IPosition;
  type: string;
}
