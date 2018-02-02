import { Injectable } from '@angular/core';
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../../environments/environment';


@Injectable()
export class AppRequestInterceptor implements HttpInterceptor {

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    if (!this.canByPass(req.url)) {
      const authRequest = req.clone({
        setHeaders: {Authorization: 'Bearer ' + sessionStorage.getItem('access_token')}
      });
      return next.handle(authRequest);
    }

    return next.handle(req);
  }

  private canByPass(url: string): boolean {
    return environment.notSecuredURL.some(entry => url.includes(entry));
  }

}
