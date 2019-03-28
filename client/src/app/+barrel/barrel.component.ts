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
import { interval, Subject, BehaviorSubject, Observable } from "rxjs";
import { takeUntil } from "rxjs/operators";
import {
  WebSocketSubject,
  webSocket,
  WebSocketSubjectConfig
} from "rxjs/websocket";
import { ContextReplacementPlugin } from "webpack";

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
      width="400"
      height="400"
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
    this.draw(0, 0, 0, 0);
  }

  private draw(oldX, x, oldY, y) {
    const { left, top } = this.myCanvas.nativeElement.getBoundingClientRect();
    this.context.moveTo(oldX - left, oldY - top);
    this.context.lineTo(x - left, y - top);
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
  public X: number;
  public Y: number;

  public oldX: number;
  public oldY: number;

  private coordRegex: RegExp = new RegExp("^(\\d+), (\\d+)");

  @HostListener("mousemove", ["$event"])
  onMousemove(event: MouseEvent) {
    this.X = event.clientX;
    this.Y = event.clientY;
  }

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
        events(msg);
      },
      err => {
        console.error(err);
      },
      () => {
        console.warn("closing connection");
      }
    );

    const events = responseEvent => {
      if (this.pre) {
        this.pre.nativeElement.innerHTML += responseEvent + "<br>";
      }
    };
    interval(100)
      .pipe()
      .subscribe(() => {
        if (this.X !== this.oldX && this.Y !== this.oldY) {
          this.clientWebSocket$.next(`X: ${this.X}, Y: ${this.Y}`);
          this.draw(this.oldX, this.X, this.oldY, this.Y);
        }
        this.oldX = this.X;
        this.oldY = this.Y;
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
