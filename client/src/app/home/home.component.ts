import { Component, OnInit } from "@angular/core";

import { AppState } from "../app.service";
import { Title } from "./title";
import { IUser } from "../user";

@Component({
  selector: "home",
  providers: [Title],
  styleUrls: ["./home.component.css"],
  templateUrl: "./home.component.html"
})
export class HomeComponent implements OnInit {
  constructor(private appService: AppState) {}
  public user: IUser = {
    name: "",
    id: "",
    host: "",
    colour: ""
  };

  public ngOnInit() {
    console.log("hello `Home` component");
    this.appService.getUserByHost().subscribe(user => {
      console.log(user);
      this.user = user;
    });
  }
}
