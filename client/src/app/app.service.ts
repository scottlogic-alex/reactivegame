import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable, Observer } from "rxjs";
import { IUser } from "./user";
import { CookieService } from "angular2-cookie";

export interface InternalStateType {
  [key: string]: any;
}

@Injectable()
export class AppState {
  public _state: InternalStateType = {};

  constructor(private http: HttpClient, private cookieService: CookieService) {}

  httpOptions = {
    headers: new HttpHeaders({ "Content-Type": "application/json" }),
    withCredentials: true
  };

  getImage(imageUrl: string): Observable<HTMLImageElement> {
    return Observable.create((observer: Observer<HTMLImageElement>) => {
      var image = new Image();
      image.onload = () => {
        observer.next(image);
        observer.complete();
      };
      image.src = imageUrl;
    });
  }

  getUserByCookieId(): Observable<IUser> {
    return this.http
      .get<IUser>(`http://ws00100:8080/lol/id`, this.httpOptions)
      .pipe();
  }

  updateColourByCookieId(colour: String): Observable<Object> {
    return this.http
      .put(`http://ws00100:8080/lol/id/colour`, colour, this.httpOptions)
      .pipe();
  }

  updateUsernameByCookieId(username: String): Observable<Object> {
    if (username.length <= 30) {
      return this.http
        .put(`http://ws00100:8080/lol/id/name`, username, this.httpOptions)
        .pipe();
    }
  }

  setInUseHatByCookieId(hatId: String): Observable<Object> {
    return this.http
      .put(`http://ws00100:8080/lol/id/hats/`, hatId, this.httpOptions)
      .pipe();
  }

  updateUserByCookieId(
    colour: string,
    username: string,
    hatId: string
  ): Observable<Object> {
    var saveObject: SaveObject = {
      colour: colour,
      username: username,
      hatId: hatId
    };
    return this.http
      .put(`http://ws00100:8080/lol/id/user/`, saveObject, this.httpOptions)
      .pipe();
  }

  getLeaderboard(): Observable<Object> {
    return this.http
      .get(`http://ws00100:8080/lol/highscores`, this.httpOptions)
      .pipe();
  }

  loginWithToken(tokenId: string) {
    return this.http
      .get(`http://ws00100:8080/lol/login/token/${tokenId}`, this.httpOptions)
      .pipe();
  }

  requestEmail(email: string) {
    return this.http
      .post(`http://ws00100:8080/lol/requestLink`, email, this.httpOptions)
      .pipe();
  }
}

interface SaveObject {
  colour: string;
  username: string;
  hatId: string;
}
