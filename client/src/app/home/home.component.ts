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
  public eyes;

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

  private drawWorm(colour: string, eyes: HTMLImageElement): void {
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

  private drawCustom(image: IAsset, imageSource: HTMLImageElement) {
    // console.log(image);
    this.wormContext.globalAlpha = 1;
    // var img = new Image();
    // img.src = blob;
    this.wormContext.drawImage(
      imageSource,
      169 - 2 * image.xAdjust,
      205 - 2 * image.yAdjust,
      image.width * 2,
      image.height * 2
    );
  }

  public getImage(imageUrl: string): Observable<HTMLImageElement> {
    return this.httpClient.get(imageUrl, { responseType: "blob" }).pipe(
      switchMap(
        (blob: Blob): Observable<HTMLImageElement> =>
          Observable.create((observer: Observer<HTMLImageElement>) => {
            const reader: FileReader = new FileReader();
            var image = new Image();
            reader.onloadend = () => {
              image.onload = () => {
                observer.next(image);
                observer.complete();
              };
              image.src = reader.result as string;
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
    this.drawWorm(this.user.colour, this.eyes);
    if (hat.name) {
      var hatImage = new Image();
      hatImage.src = assets[this.selectedHat.name].url;
      this.drawCustom(assets[this.selectedHat.name], hatImage);
    }
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
      // this.getImage(this.assets.fedora.)
    ).subscribe(([user, eyesImage]: [IUser, HTMLImageElement]) => {
      console.log(user);
      this.user = user;
      this.fillSquare(user.colour);
      this.drawWorm(user.colour, eyesImage);
      this.eyes = eyesImage;
    });
  }
}

interface IElementRef<T> extends ElementRef {
  nativeElement: T;
}
