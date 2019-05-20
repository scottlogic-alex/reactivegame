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
  public emailSent: boolean = false;

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
      this.appService
        .requestEmail(this.registerForm.value)
        .subscribe(bool => (this.emailSent = bool));
      this.registerForm.reset();
    }
  }
}
