import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {OAuthModule} from "angular-oauth2-oidc";
import {SecurityModule} from "./security/security.module";
import {AppRoutingModule} from "./app-routing.module";
import {HttpClientModule} from "@angular/common/http";
import {CoreModule} from "./core/core.module";
import {StoreModule} from "@ngrx/store";
import {reducerProvider, reducerToken} from "./core/store/reducer/index";
import {InitializationEffects} from "./core/store/effect/initialization.effects";
import {EffectsModule} from "@ngrx/effects";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import {UserListComponent} from "./user/user.list.component";
import {UserService} from "./user/user.service"
import {AuthHttp} from "angular2-jwt";
import {MembersModule} from "./members/members.module";
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    MembersModule,
    OAuthModule.forRoot(),
    SecurityModule,
    CoreModule,
    AppRoutingModule,
    HttpClientModule,
    StoreModule.forRoot(reducerToken),
    EffectsModule.forRoot([InitializationEffects]),
    NgbModule.forRoot()
  ],
  providers: [
    reducerProvider,
    UserService],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
