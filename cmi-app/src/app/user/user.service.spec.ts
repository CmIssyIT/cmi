import {HttpModule, RequestMethod, Response, ResponseOptions, XHRBackend} from '@angular/http';
import {async, getTestBed, inject, TestBed} from '@angular/core/testing';
import {MockBackend, MockConnection} from '@angular/http/testing';

import {UserService} from './user.service';
import {User} from './user';

describe('UserService', () => {

  beforeEach(() => {

    TestBed.configureTestingModule({
      imports: [HttpModule],
      providers: [UserService, {provide: XHRBackend, useClass: MockBackend}]
    });

  });

  describe('list method', () => {

    const expected: User[] = [new User('firstName1', 'lastName1'), new User('firstName2', 'lastName2')];

    it('should call GET /users endpoint', async(inject([XHRBackend], (mockBackend: MockBackend) => {

      mockBackend.connections.subscribe((connection: MockConnection) => {
        expect(connection.request.method).toEqual(RequestMethod.Get);
        expect(connection.request.url).toEqual('/users');
        expect(connection.request.getBody()).toBeNull();
        connection.mockRespond(new Response(new ResponseOptions({status: 200, body: expected})));
      });

      const userService = getTestBed().get(UserService);

      userService.list();

    })));

    it('should return observable with users when status is 200', async(inject([XHRBackend], (mockBackend: MockBackend) => {

      mockBackend.connections.subscribe((connection: MockConnection) => {
        connection.mockRespond(new Response(new ResponseOptions({status: 200, body: expected})));
      });

      const userService = getTestBed().get(UserService);

      userService.list().subscribe(actualUsers => expect(actualUsers).toEqual(expected));

    })));

    it('should return observable with no users when status is not 200', async(inject([XHRBackend], (mockBackend: MockBackend) => {

      mockBackend.connections.subscribe((connection: MockConnection) => {
        connection.mockRespond(new Response(new ResponseOptions({status: 500, body: 'Error'})));
      });

      const userService = getTestBed().get(UserService);

      userService.list().subscribe(actualUsers => expect(actualUsers).toBe([]));

    })));

  });

});
