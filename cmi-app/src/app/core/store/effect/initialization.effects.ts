import { GetCurrentUserFunctionAction, LoadCurrentUserDataAction } from '../action/currentUser.action';
import * as actions from '../action/initialization.action';
import { Actions, Effect } from '@ngrx/effects';
import { Injectable } from '@angular/core';
import { SecurityService } from '../../service/security.service';
import 'rxjs/add/operator/concatMap';

@Injectable()
export class InitializationEffects {

  constructor(private actions$: Actions,
              private securityService: SecurityService) {
  }

  @Effect()
  init$ = this.actions$
    .ofType(actions.INITIALIZATION)
    .concatMap(() => [
      new LoadCurrentUserDataAction(this.securityService.currentUserData()),
      new GetCurrentUserFunctionAction()
    ]);
}
