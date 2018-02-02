import {InjectionToken} from '@angular/core';
import {ActionReducerMap, createFeatureSelector, createSelector, MetaReducer} from '@ngrx/store';
import {storeFreeze} from 'ngrx-store-freeze';

import {environment} from '../../../../environments/environment';
import * as fromCurrentUser from './currentUser.reducer';

export interface CMIState {
  currentUser: fromCurrentUser.State;
}

export const reducers: ActionReducerMap<CMIState> = {
  currentUser: fromCurrentUser.currentUserReducer
};

export const reducerToken = new InjectionToken<ActionReducerMap<CMIState>>('Reducers');

export function getReducers() {
  return {...reducers};
}

export const reducerProvider = [
  {provide: reducerToken, useFactory: getReducers}
];


export const metaReducers: MetaReducer<CMIState>[] = !environment.production ? [storeFreeze] : [];

const getCurrentUserState = createFeatureSelector<fromCurrentUser.State>('currentUser');

export const getCurrentUser = createSelector(
  getCurrentUserState,
  currentUser => currentUser
);
