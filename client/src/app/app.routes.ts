import { Routes } from "@angular/router";
import { HomeComponent } from "./home";
import { NoContentComponent } from "./no-content";
import { LeaderboardComponent } from "./leaderboard/leaderboard.component";

export const ROUTES: Routes = [
  { path: "", component: HomeComponent },
  { path: "home", component: HomeComponent },
  { path: "barrel", loadChildren: "./+barrel#BarrelModule" },
  { path: "leaderboard", component: LeaderboardComponent },
  { path: "**", component: NoContentComponent }
];
