import {Component, OnInit} from '@angular/core';
import {User} from './user';
import {UserService} from './user.service';
import {Observable} from 'rxjs/Observable';
import {OAuthService} from 'angular-oauth2-oidc';

@Component({
  templateUrl: './user.list.component.html',
  styleUrls: ['./user.list.component.css'],
  providers: [UserService],
})
export class UserListComponent implements OnInit {

  me: Observable<User>;
  users: Observable<User[]>;

  constructor(private oauthService: OAuthService, private userService: UserService) {
  }

  ngOnInit() {
    this.me = this.userService.me();
    this.users = this.userService.list();
  }

  login() {
    this.oauthService.initImplicitFlow('', {"resourceServer": "Identity Provider"});
  }

  isAuthenticated() {
    return this.oauthService.getIdentityClaims();
  }

  logout() {
    this.oauthService.logOut();
  }
}
