import { OnInit, OnDestroy, Component } from "@angular/core";
import { AppState } from "app/app.service";

@Component({
  templateUrl: "./leaderboard.component.html",
  styleUrls: ["./leaderboard.component.css"]
})
export class LeaderboardComponent {
  constructor(private appService: AppState) {}
}
