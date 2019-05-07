import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";

import { AppState } from "../app.service";
import { Title } from "./title";
import { IUser } from "../user";
import {
  assets,
  IAsset,
  IHat,
  AssetTypes,
  LoadedImages,
  KeyedImage
} from "../asset";
import { forkJoin } from "rxjs";
import { CookieService } from "angular2-cookie/core";
import { map } from "rxjs/operators";

@Component({
  selector: "home",
  providers: [Title],
  styleUrls: ["./home.component.css"],
  templateUrl: "./home.component.html"
})
export class HomeComponent implements OnInit {
  constructor(
    private appService: AppState,
    private cookieService: CookieService
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
  public i: number = 0;
  public color: string = "";
  public username: string = "";
  public images: Record<AssetTypes, HTMLImageElement>;

  @ViewChild("worm", { read: ElementRef }) worm: IElementRef<HTMLCanvasElement>;
  public wormContext: CanvasRenderingContext2D;

  public increase(): void {
    if (this.i < this.user.items.length - 3) {
      this.i++;
    }
  }

  public decrease(): void {
    if (this.i > 0) {
      this.i--;
    }
  }

  public changeColour(): void {
    this.appService.updateColourByCookieId(this.color).subscribe();
    this.wormContext.clearRect(0, 0, 300, 300);
    this.drawWorm(this.color);
    this.drawCustom(
      this.assets[this.selectedHat.name],
      this.images[this.selectedHat.name]
    );
  }

  private drawWorm(colour: string): void {
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
    this.drawCustom(assets.Eyes, this.images.Eyes);
  }

  private drawCustom(image: IAsset, imageSource: HTMLImageElement) {
    // console.log(image);
    this.wormContext.globalAlpha = 1;
    this.wormContext.drawImage(
      imageSource,
      169 - 2 * image.xAdjust,
      205 - 2 * image.yAdjust,
      image.width * 2,
      image.height * 2
    );
  }

  public save(): void {
    console.log(this.selectedHat);
    this.appService.setInUseHatByCookieId(this.selectedHat.id).subscribe();
    this.appService.updateUsernameByCookieId(this.username).subscribe();
  }

  public selectHat(hat: IHat): void {
    this.selectedHat = hat;
    this.wormContext.clearRect(0, 0, 300, 300);
    this.drawWorm(this.user.colour);
    if (hat.name) {
      this.drawCustom(
        assets[this.selectedHat.name],
        this.images[this.selectedHat.name]
      );
    }
  }

  public clearHat(): void {
    let hat: IHat = {
      id: "noHat",
      consumable: false,
      inUse: false,
      name: "",
      type: "Hat"
    };
    this.selectHat(hat);
  }

  public getCookie(key: string) {
    return this.cookieService.get(key);
  }

  public ngOnInit() {
    console.log("hello `Home` component");
    this.wormContext = this.worm.nativeElement.getContext("2d");
    forkJoin(
      this.appService.getUserByCookieId(),
      forkJoin(
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
      )
    ).subscribe(([user, keyedImages]: [IUser, LoadedImages]) => {
      console.log(keyedImages);
      this.user = user;
      this.color = user.colour;
      this.username = user.name;
      this.images = keyedImages;
      this.drawWorm(user.colour);
      let hat = user.items.find(
        item => item.type == "Hat" && item.inUse == true
      );
      if (hat) {
        this.selectedHat = hat;
        this.drawCustom(assets[hat.name], keyedImages[hat.name]);
      }
    });
  }
}

interface IElementRef<T> extends ElementRef {
  nativeElement: T;
}
