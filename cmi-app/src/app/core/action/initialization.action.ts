import { Action } from '@ngrx/store';

export const INITIALIZATION = '[Initialization] Initialization Action';


export class InitializationAction implements Action {
  readonly type = INITIALIZATION;
}


export type Actions =
  InitializationAction;
