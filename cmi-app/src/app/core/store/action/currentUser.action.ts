import { CurrentUser } from '../model/currentUser.model';
import { Action } from '@ngrx/store';

export const GET_CURRENT_USER_FUNCTION = '[CurrentUser] Get CurrentUser function';
export const GET_CURRENT_USER_FUNCTION_SUCCESS = '[CurrentUser] Get CurrentUser function success';

export const LOAD_CURRENT_USER_DATA = '[CurrentUser] Load Current Inscription Data';
export const LOAD_CURRENT_USER_DATA_SUCCESS = '[CurrentUser] Load Current Inscription Data Success';

export class LoadCurrentUserDataAction implements Action {
  readonly type = LOAD_CURRENT_USER_DATA;
  constructor(public payload: CurrentUser) { }
}

export class GetCurrentUserFunctionAction implements Action {
  readonly type = GET_CURRENT_USER_FUNCTION;
}
export class GetCurrentUserFunctionSuccessAction implements Action {
  readonly type = GET_CURRENT_USER_FUNCTION_SUCCESS;
  constructor(public payload: CurrentUser) { }
}

export type Actions =
  LoadCurrentUserDataAction
  | GetCurrentUserFunctionAction
  | GetCurrentUserFunctionSuccessAction;
