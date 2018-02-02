import * as actions from '../action/currentUser.action';
import {CurrentUser} from '../model/currentUser.model';

export type State = CurrentUser;

const initialState: State = {
  firstname: '',
  lastname: '',
  roles: []
};

export function currentUserReducer(state: State = initialState, action: actions.Actions): State {

  switch (action.type) {

    case actions.LOAD_CURRENT_USER_DATA:
      return {
        ...state,
        ...action.payload
      };

    case actions.GET_CURRENT_USER_FUNCTION_SUCCESS:
      return {
        ...state,
        ...action.payload
      };
    default:
      return state;
  }
}

