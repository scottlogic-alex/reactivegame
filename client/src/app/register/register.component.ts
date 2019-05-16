import { OnInit, Component } from "@angular/core";
import { AppState } from "app/app.service";
import {
  ValidatorFn,
  AbstractControl,
  FormBuilder,
  Validators,
  FormControl
} from "@angular/forms";

@Component({
  templateUrl: "./register.component.html",
  styleUrls: ["register.component.css"]
})
export class RegisterComponent {
  constructor(private appService: AppState, private fb: FormBuilder) {}

  //   public email: string;
  registerForm: FormControl = new FormControl("", [
    Validators.required,
    this.emailPrefixValidator
  ]);

  emailPrefixValidator(control: FormControl) {
    console.log(control);
    const regex: RegExp = /^[\w\d-]+$/g;
    if (!control.value) return null;
    const valid = regex.test(control.value);
    return valid
      ? null
      : {
          validateEmail: {
            valid: false
          }
        };
  }

  public requestEmail() {
    if (this.registerForm.valid) {
      this.appService.requestEmail(this.registerForm.value).subscribe();
      this.registerForm.reset();
    }
  }
}
