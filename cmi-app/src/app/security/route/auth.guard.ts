import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot } from '@angular/router';
import { OAuthService } from 'angular-oauth2-oidc';

/**
 * Guards the access of any page requiring an authentication
 */
@Injectable()
export class AuthGuard implements CanActivate {

  constructor(private oAuthService: OAuthService) {
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    // To be changed and use the token_expires event
    const expiry = this.oAuthService.getAccessTokenExpiration();

    if (expiry) {
      const now = new Date().getTime();
      const expired = now > expiry;

      if (!expired) {
        return true;
      }
    }

    this.oAuthService.initImplicitFlow('', { 'resourceServer': 'Identity Provider' });
    return false;
  }
}
