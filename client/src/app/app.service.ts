import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";

export interface InternalStateType {
  [key: string]: any;
}

@Injectable()
export class AppState {
  public _state: InternalStateType = {};

  constructor(private http: HttpClient) {}

  httpOptions = {
    headers: new HttpHeaders({ "Content-Type": "application/json" })
  };

  getUserByName(name: String): Observable<Object> {
    return this.http
      .get(`http://ws00100:8080/lol/name/${name}`, this.httpOptions)
      .pipe();
  }

  getUserByHost(): Observable<Object> {
    return this.http
      .get(`http://ws00100:8080/lol/host`, this.httpOptions)
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
}
