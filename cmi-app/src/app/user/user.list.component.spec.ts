import {async, TestBed} from '@angular/core/testing';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/of';

import {UserListComponent} from './user.list.component';
import {UserService} from './user.service';
import {User} from './user';

class UserFakeService {

  // noinspection JSMethodCanBeStatic
  list() {
    return Observable.of([new User('firstName1', 'lastName1'), new User('firstName2', 'lastName2')]);
  }

}

describe('UserListComponent', () => {

  beforeEach(() =>
    TestBed
      .configureTestingModule({declarations: [UserListComponent]})
      .overrideComponent(UserListComponent, {
        set: {
          providers: [
            {provide: UserService, useClass: UserFakeService}
          ]
        }
      })
  );

  it('should be created successfully', async(() => {
    const fixture = TestBed.createComponent(UserListComponent);
    const userList = fixture.debugElement.componentInstance;
    expect(userList).toBeTruthy();
  }));

  it('should render a list of users in ul li elements', async(() => {
    const fixture = TestBed.createComponent(UserListComponent);
    fixture.detectChanges();
    const list = fixture.debugElement.nativeElement.querySelectorAll('ul li');
    expect(list).toBeTruthy();
    expect(list.length).toEqual(2);
    expect(list[0].textContent).toEqual('firstName1 lastName1');
    expect(list[1].textContent).toEqual('firstName2 lastName2');
  }));

});
