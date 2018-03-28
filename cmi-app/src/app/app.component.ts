import { Component, OnDestroy, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import * as fromRoot from './core/store/reducer';
import { Subscription } from 'rxjs/Subscription';
import { NavigationEnd, Router } from '@angular/router';
import { SecurityService } from './core/service/security.service';
import { InitializationAction } from './core/store/action/initialization.action';
import {Observable} from "rxjs/Observable";
import {CurrentUser} from "./core/store/model/currentUser.model";

/**
 * Main component of the app.
 */
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css','navbar.css']
})
export class AppComponent implements OnInit, OnDestroy {
  title = 'CMI App';
  currentUser$: Observable<CurrentUser>;
  toggled = false;
  constructor(private securityService: SecurityService,
              private router: Router,
              private store: Store<fromRoot.CMIState>) {
  }

  routerSubscription: Subscription;
  subscription: Subscription;

  ngOnInit() {
    this.subscription = this.securityService.initOauthLogin()
      .filter(() => this.securityService.isLoggedIn())
      .subscribe(() => this.store.dispatch(new InitializationAction()));

    this.routerSubscription = this.router
      .events
      .filter(event => event instanceof NavigationEnd)
      .subscribe(() => {
        window.scrollTo(0, 0);
      });

    this.currentUser$ = this.store.select(fromRoot.getCurrentUser);
  }

  ngOnDestroy() {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.routerSubscription) {
      this.routerSubscription.unsubscribe();
    }
  }
}
