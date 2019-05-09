import { OnInit, Component } from "@angular/core";
import { AppState } from "app/app.service";
import { IUser } from "app/user";
import { assets } from "../asset";

@Component({
  templateUrl: "./leaderboard.component.html",
  styleUrls: ["./leaderboard.component.css"]
})
export class LeaderboardComponent implements OnInit {
  constructor(private appService: AppState) {}

  public leadersList: Array<IUser>;
  public assets = assets;

  ngOnInit() {
    console.log("hello leaderboard");
    this.appService.getLeaderboard().subscribe(list => {
      this.leadersList = Object.values(list)
        .sort((a, b) => b.high_score - a.high_score)
        .slice(0, 10)
        .map(user => ({
          ...user,
          hat: user.items.find(
            item => item.type === "Hat" && item.inUse === true
          )
        }));
    });
  }
}
