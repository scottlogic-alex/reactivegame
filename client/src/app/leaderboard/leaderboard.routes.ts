import { LeaderboardComponent } from "./leaderboard.component";

export const routes = [
  { path: "", children: [{ path: "", component: LeaderboardComponent }] }
];
