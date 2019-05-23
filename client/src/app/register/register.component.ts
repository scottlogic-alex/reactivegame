import { Component } from "@angular/core";
import { AppState } from "app/app.service";
import { Validators, FormControl } from "@angular/forms";

@Component({
  templateUrl: "./register.component.html",
  styleUrls: ["register.component.css"]
})
export class RegisterComponent {
  constructor(private appService: AppState) {}

  public formSent: boolean = false;
  public formVisible: boolean = true;
  public displayMessage: string = "";

  registerForm: FormControl = new FormControl("", [
    Validators.required,
    this.emailPrefixValidator
  ]);

  emailPrefixValidator(control: FormControl) {
    const regex: RegExp = /^[\w\d-]+$/g;
    if (!control.value) return null;
    const valid = regex.test(control.value);
    return valid
      ? null
      : {
          inValidEmail: true
        };
  }

  public requestEmail() {
    if (this.registerForm.valid) {
      this.formSent = true;
      this.appService.requestEmail(this.registerForm.value).subscribe(msg => {
        switch (msg.payload) {
          case "INVALID_REQUEST": {
            this.displayMessage =
              "The email address submitted is invalid, please check for typos and try again";
            break;
          }
          case "NEW_TOKEN": {
            this.displayMessage =
              "Welcome back! A link has been sent to your email";
            this.formVisible = false;
            this.registerForm.reset();
            break;
          }
          case "TOKEN_EXISTS": {
            this.displayMessage =
              "A token previously sent to this email address is still valid, please search your inbox";
            this.formVisible = false;
            this.registerForm.reset();
            break;
          }
          case "NEW_USER": {
            this.displayMessage =
              "Welcome to worm world new user! A link has been sent to your email";
            this.formVisible = false;
            this.registerForm.reset();
            break;
          }
        }
      });
    }
  }
}
