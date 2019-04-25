import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";

import { AppState } from "../app.service";
import { Title } from "./title";
import { IUser } from "../user";
import { assets, IAsset, IHat } from "../asset";
import { HttpClient } from "@angular/common/http";
import { Observable, forkJoin, Observer } from "rxjs";
import { URL } from "url";
import { map, switchMap } from "rxjs/operators";

@Component({
  selector: "home",
  providers: [Title],
  styleUrls: ["./home.component.css"],
  templateUrl: "./home.component.html"
})
export class HomeComponent implements OnInit {
  constructor(
    private appService: AppState,
    private readonly httpClient: HttpClient
  ) {}
  public user: IUser = {
    name: "",
    id: "",
    host: "",
    colour: "",
    items: []
  };
  public selectedHat: IHat = {
    id: "",
    consumable: false,
    inUse: false,
    name: "",
    type: "Hat"
  };
  public assets = assets;

  @ViewChild("worm", { read: ElementRef }) worm: IElementRef<HTMLCanvasElement>;
  public wormContext: CanvasRenderingContext2D;

  @ViewChild("colour", { read: ElementRef }) colour: IElementRef<
    HTMLCanvasElement
  >;
  public colourContext: CanvasRenderingContext2D;

  private fillSquare(colour: string): void {
    this.colourContext.fillStyle = colour;
    this.colourContext.fillRect(0, 0, 30, 30);
  }

  private drawWorm(colour: string, eyes: string): void {
    this.wormContext.globalAlpha = 1;
    this.wormContext.lineWidth = 3;
    this.wormContext.strokeStyle = "black";
    this.wormContext.fillStyle = colour;
    let arr = [
      [94, 344],
      [120, 375],
      [160, 375],
      [186, 344],
      [170, 305],
      [131, 290],
      [110, 255],
      [130, 220],
      [169, 205]
    ];
    for (let i of arr) {
      this.wormContext.beginPath();
      this.wormContext.arc(i[0], i[1], 20, 0, 2 * Math.PI);
      this.wormContext.stroke();
      this.wormContext.fill();
    }
    this.drawCustom(assets.Eyes, eyes);
  }

  private drawCustom(image: IAsset, blob: string) {
    // console.log(image);
    this.wormContext.globalAlpha = 1;
    var img = new Image();
    img.src = blob;
    this.wormContext.drawImage(
      img,
      169 - 2 * image.xAdjust,
      205 - 2 * image.yAdjust,
      image.width * 2,
      image.height * 2
    );
  }

  public getImage(imageUrl: string): Observable<string> {
    return this.httpClient.get(imageUrl, { responseType: "blob" }).pipe(
      switchMap(
        (blob: Blob): Observable<string> =>
          Observable.create((observer: Observer<string>) => {
            const reader: FileReader = new FileReader();
            reader.onloadend = () => {
              console.warn(reader.result);
              // const [, base64Data]: string[] = (reader.result as string).split(
              //   ",",
              //   2
              // );
              observer.next(reader.result as string);
              observer.complete();
            };
            reader.readAsDataURL(blob);
          })
      )
    );
  }

  public saveHat(): void {
    console.log(this.selectedHat);
  }

  public selectHat(hat: IHat): void {
    this.selectedHat = hat;
    this.wormContext.clearRect(0, 0, 300, 300);
    // this.drawWorm(this.user.colour, );
    // if (hat.name) this.drawCustom(assets[this.selectedHat.name]);
  }

  public clearHat(): void {
    let hat: IHat = {
      id: "",
      consumable: false,
      inUse: false,
      name: "",
      type: "Hat"
    };
    this.selectHat(hat);
  }

  public ngOnInit() {
    console.log("hello `Home` component");
    this.wormContext = this.worm.nativeElement.getContext("2d");
    this.colourContext = this.colour.nativeElement.getContext("2d");
    forkJoin(
      this.appService.getUserByHost(),
      this.getImage(this.assets.Eyes.url)
    ).subscribe(([user, blob]: [IUser, string]) => {
      console.log(user);
      this.user = user;
      this.fillSquare(user.colour);
      this.drawWorm(user.colour, blob);
    });
  }
}

interface IElementRef<T> extends ElementRef {
  nativeElement: T;
}
