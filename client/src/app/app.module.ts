import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { RouterModule, PreloadAllModules } from "@angular/router";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { FlexLayoutModule } from "@angular/flex-layout";
import { CookieService } from "angular2-cookie/services/cookies.service";
import { ColorPickerModule } from "ngx-color-picker";
import { ReactiveFormsModule } from "@angular/forms";

/*
 * Platform and Environment providers/directives/pipes
 */
import { environment } from "environments/environment";
import { ROUTES } from "./app.routes";
// App is our top level component
import { AppComponent } from "./app.component";
import { APP_RESOLVER_PROVIDERS } from "./app.resolver";
import { AppState, InternalStateType } from "./app.service";
import { HomeComponent } from "./home";
import { RegisterComponent } from "./register";
import { LeaderboardComponent } from "./leaderboard/leaderboard.component";
import { NoContentComponent } from "./no-content";
import { XLargeDirective } from "./home/x-large";
import { DevModuleModule } from "./+dev-module";

import "../styles/styles.scss";
import "../styles/headings.css";

// Application wide providers
const APP_PROVIDERS = [...APP_RESOLVER_PROVIDERS, AppState];

interface StoreType {
  state: InternalStateType;
  restoreInputValues: () => void;
  disposeOldHosts: () => void;
}
/**
 * `AppModule` is the main entry point into Angular2's bootstraping process
 */
@NgModule({
  bootstrap: [AppComponent],
  declarations: [
    AppComponent,
    HomeComponent,
    RegisterComponent,
    LeaderboardComponent,
    NoContentComponent,
    XLargeDirective
  ],
  /**
   * Import Angular's modules.
   */
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    FlexLayoutModule,
    HttpClientModule,
    ColorPickerModule,
    ReactiveFormsModule,
    RouterModule.forRoot(ROUTES, {
      useHash: Boolean(history.pushState) === false,
      preloadingStrategy: PreloadAllModules
    }),

    /**
     * This section will import the `DevModuleModule` only in certain build types.
     * When the module is not imported it will get tree shaked.
     * This is a simple example, a big app should probably implement some logic
     */
    ...(environment.showDevModule ? [DevModuleModule] : [])
  ],
  /**
   * Expose our Services and Providers into Angular's dependency injection.
   */
  providers: [environment.ENV_PROVIDERS, APP_PROVIDERS, CookieService]
})
export class AppModule {}
