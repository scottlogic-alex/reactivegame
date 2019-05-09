import { NgModule } from "@angular/core";
import { LeaderboardComponent } from "./leaderboard.component";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { routes } from "app/leaderboard/leaderboard.routes";

console.log("hello leaderboard component");

@NgModule({
  declarations: [LeaderboardComponent],
  imports: [CommonModule, RouterModule.forChild(routes)]
})
export class LeaderboardModule {
  public static routes = routes;
}
