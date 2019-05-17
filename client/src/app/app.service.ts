import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable, Observer } from "rxjs";
import { IUser } from "./user";

export interface InternalStateType {
  [key: string]: any;
}

@Injectable()
export class AppState {
  constructor(private http: HttpClient) {
    const protocol = window.location.protocol;
    const hostname = window.location.hostname;
    this.url = `${protocol}//${hostname}:8080/lol`;
  }
  private readonly url: string;

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
    return this.http.get<IUser>(`${this.url}/id`, this.httpOptions).pipe();
  }

  updateColourByCookieId(colour: String): Observable<Object> {
    return this.http
      .put(`${this.url}/id/colour`, colour, this.httpOptions)
      .pipe();
  }

  updateUsernameByCookieId(username: String): Observable<Object> {
    if (username.length <= 30) {
      return this.http
        .put(`${this.url}/id/name`, username, this.httpOptions)
        .pipe();
    }
  }

  setInUseHatByCookieId(hatId: String): Observable<Object> {
    return this.http
      .put(`${this.url}/id/hats/`, hatId, this.httpOptions)
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
      .put(`${this.url}/id/user/`, saveObject, this.httpOptions)
      .pipe();
  }

  getLeaderboard(): Observable<Object> {
    return this.http.get(`${this.url}/highscores`, this.httpOptions).pipe();
  }

  loginWithToken(tokenId: string) {
    return this.http
      .get(`${this.url}/login/token/${tokenId}`, this.httpOptions)
      .pipe();
  }

  requestEmail(email: string) {
    return this.http
      .post(`${this.url}/requestLink`, email, this.httpOptions)
      .pipe();
  }

  validate(): Observable<boolean> {
    return this.http
      .get<boolean>(`${this.url}/validate`, this.httpOptions)
      .pipe();
  }
}

interface SaveObject {
  colour: string;
  username: string;
  hatId: string;
}
