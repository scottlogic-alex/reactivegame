import { CanActivate, Router } from "@angular/router";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { AppState } from "./app.service";
import { tap } from "rxjs/operators";

@Injectable()
export class RouteGuard implements CanActivate {
  constructor(private router: Router, private appService: AppState) {}

  canActivate(): Observable<boolean> {
    return this.appService.validate().pipe(
      tap(bool => {
        if (!bool) this.router.navigate(["/register"]);
      })
    );
  }
}
