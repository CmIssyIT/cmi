import {Injectable} from '@angular/core';
import { AuthHttp } from 'angular2-jwt';

import {User} from './user';

import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/filter';

@Injectable()
export class UserService {

  private meUrl = '/me';
  private usersUrl = '/users';

  constructor(private http: AuthHttp) {
  }

  me(): Observable<User> {
    return this.http.get(this.meUrl)
      .filter(response => response.status === 200)
      .map(response => response.json() as User);
  }

  list(): Observable<User[]> {
    return this.http.get(this.usersUrl)
      .filter(response => response.status === 200)
      .map(response => response.json() as User[]);
  }

}
