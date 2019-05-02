import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
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

  // getUserByName(name: String): Observable<IUser> {
  //   return this.http
  //     .get<IUser>(`http://ws00100:8080/lol/name/${name}`, this.httpOptions)
  //     .pipe();
  // }

  getUserByHost(): Observable<IUser> {
    return this.http
      .get<IUser>(`http://ws00100:8080/lol/host`, this.httpOptions)
      .pipe();
  }

  getUserByCookieId(): Observable<IUser> {
    return this.http
      .get<IUser>(`http://ws00100:8080/lol/id`, this.httpOptions)
      .pipe();
  }

  updateColour(colour: String): Observable<Object> {
    console.log("sent");
    return this.http
      .put(`http://ws00100:8080/lol/host/colour`, colour, this.httpOptions)
      .pipe();
  }

  updateUsername(username: String): Observable<Object> {
    return this.http
      .put(`http://ws00100:8080/lol/host/name`, username, this.httpOptions)
      .pipe();
  }

  setInUseHat(hatId: String): Observable<Object> {
    return this.http
      .put(`http://ws00100:8080/lol/host/hats/`, hatId, this.httpOptions)
      .pipe();
  }
}
