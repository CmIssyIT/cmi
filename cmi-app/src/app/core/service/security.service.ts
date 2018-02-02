import {Injectable} from '@angular/core';
import {OAuthService} from 'angular-oauth2-oidc';
import {Observable} from 'rxjs/Observable';
import {JwtHelper} from 'angular2-jwt';
import {CurrentUser} from '../store/model/currentUser.model';
import 'rxjs/add/observable/fromPromise';
import {openId} from "../../../environments/environment";

@Injectable()
export class SecurityService {

  constructor(private oauthService: OAuthService) {
  }


  initOauthLogin(): Observable<void> {
    // Redirect to login page
    this.oauthService.issuer = openId.ISSUER;
    this.oauthService.loginUrl = openId.LOGIN_URL;
    this.oauthService.redirectUri = openId.REDIRECT_URL;
    this.oauthService.clientId = openId.CLIENT_ID;
    this.oauthService.scope = openId.SCOPE;
    this.oauthService.logoutUrl = openId.LOGOUT_URL;
    this.oauthService.oidc = true;
    this.oauthService.setStorage(sessionStorage);
    if (openId.useSilentRefresh) {
      this.oauthService.setupAutomaticSilentRefresh();
      this.oauthService.silentRefreshRedirectUri = openId.silentRefreshRedirectUri;
    }
    return Observable.fromPromise(this.oauthService.tryLogin({}));
  }

  currentUserData(): CurrentUser {
    const token = this.oauthService.getAccessToken();

    if (token === void 0 || token === null) {
      return;
    }
    const jwt = new JwtHelper();

    const {realm_access, firstname, lastname} = jwt.decodeToken(token);
    let roles = [];
    if (realm_access !== void 0 && realm_access !== null) {
      roles = realm_access.roles;
    }
    return {firstname, lastname, roles};
  }

  isLoggedIn() {
    return this.oauthService.hasValidAccessToken();
  }

}
