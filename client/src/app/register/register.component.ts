import { OnInit, Component } from "@angular/core";
import { AppState } from "app/app.service";

@Component({
  templateUrl: "./register.component.html",
  styleUrls: ["register.component.css"]
})
export class RegisterComponent implements OnInit {
  constructor(private appService: AppState) {}
  ngOnInit(): void {
    console.log("hello register component");
  }
}
