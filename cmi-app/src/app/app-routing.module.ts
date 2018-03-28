import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {UserListComponent} from './user/user.list.component';
import {AuthGuard} from "./security/route/auth.guard";
import {HomeComponent} from "./core/component/home/home.component";
import {MemberListComponent} from "./members/member.list.component";

const routes: Routes = [
  {path: '', redirectTo: 'members', pathMatch: 'full'},
  {path: 'home', component: HomeComponent , canActivate: [AuthGuard]},
  {path: 'members', component: MemberListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {
}
