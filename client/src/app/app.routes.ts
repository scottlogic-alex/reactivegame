import { Routes } from "@angular/router";
import { HomeComponent } from "./home";
import { NoContentComponent } from "./no-content";
import { LeaderboardComponent } from "./leaderboard/leaderboard.component";
import { RegisterComponent } from "./register";
import { RouteGuard } from "./route-guards.service";

export const ROUTES: Routes = [
  { path: "", redirectTo: "/home", pathMatch: "full" },
  { path: "home", component: HomeComponent, canActivate: [RouteGuard] },
  {
    path: "barrel",
    canActivate: [RouteGuard],
    loadChildren: "./+barrel#BarrelModule"
  },
  { path: "leaderboard", component: LeaderboardComponent },
  { path: "register", component: RegisterComponent },
  { path: "**", component: NoContentComponent }
];
