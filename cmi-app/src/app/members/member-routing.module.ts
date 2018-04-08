import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MemberListComponent} from "./components/member-list/member-list.component";
import {AuthGuard} from "../security/route/auth.guard";

const MEMBERS_ROUTES: Routes = [
  {path: '', component: MemberListComponent, canActivate: [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forChild(MEMBERS_ROUTES)],
  exports: [RouterModule]
})

export class MemberRoutingModule {
}
