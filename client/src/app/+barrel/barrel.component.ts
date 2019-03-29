import {
  Component,
  OnInit,
  OnDestroy,
  ElementRef,
  ViewChild,
  HostListener,
  EventEmitter
} from "@angular/core";
import { prepareProfile } from "selenium-webdriver/firefox";
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
import { ContextReplacementPlugin } from "webpack";
import { deflateRaw } from "zlib";

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
    <button (click)="send()">send</button>
    <div>{{ this.X }}, {{ this.Y }}</div>
    <canvas
      #myCanvas
      width="1000"
      height="800"
      style="border:1px solid"
    ></canvas>
    <pre>{{ positions$ | async | json }}</pre>
    <router-outlet></router-outlet>
  `
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
    this.draw(0, 0);
  }

  private draw(x: number, y: number) {
    const { left, top } = this.myCanvas.nativeElement.getBoundingClientRect();
    this.context.beginPath();
    this.context.arc(x - left, y - top, 10, 0, 2 * Math.PI);
    this.context.stroke();
  }

  @ViewChild("pre", { read: ElementRef })
  private pre: IElementRef<HTMLPreElement>;
  public positions$: Subject<IPosition> = new BehaviorSubject<IPosition>({
    x: 0,
    y: 0
  });

  public send(): void {
    this.clientWebSocket$.next("messsage from angular");
  }

  private coordRegex: RegExp = new RegExp("^(\\d+), (\\d+)");

  @HostListener("mousemove", ["$event"])
  onMousemove(event: MouseEvent) {
    this.mouseEvents$.next({ x: event.clientX, y: event.clientY });
  }

  private mouseEvents$: Subject<IPosition> = new Subject<IPosition>();

  public ngOnInit() {
    const config: WebSocketSubjectConfig<string> = {
      url: "ws://localhost:8080/wut",
      deserializer: (e: MessageEvent) => e.data
    };
    this.clientWebSocket$ = webSocket(config);

    this.clientWebSocket$.pipe(takeUntil(this.destroy$)).subscribe(
      msg => {
        const match: RegExpExecArray | null = this.coordRegex.exec(msg);
        if (match) {
          const [, x, y] = match;
          this.positions$.next({ x: +x, y: +y });
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
        withLatestFrom(this.positions$.pipe(bufferCount(10, 1))),
        takeUntil(this.destroy$)
      )
      .subscribe(([, positions]) => {
        if (this.context) {
          this.context.clearRect(0, 0, 1000, 800);
          positions.forEach(coord => {
            this.draw(coord.x, coord.y);
          });
        }
      });

    this.mouseEvents$
      .pipe(
        distinctUntilChanged(
          (a: IPosition, b: IPosition) => a.x === b.x && a.y === b.y
        ),
        takeUntil(this.destroy$)
      )
      .subscribe(position => {
        this.clientWebSocket$.next(`X: ${position.x}, Y: ${position.y}`);
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
