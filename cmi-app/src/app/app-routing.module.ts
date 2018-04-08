import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AuthGuard} from './security/route/auth.guard';
import {HomeComponent} from './core/component/home/home.component';
import {MemberListComponent} from './members/components/member-list/member-list.component';

const routes: Routes = [
  {path: '', redirectTo: 'members', pathMatch: 'full'},
  {path: 'home', component: HomeComponent, canActivate: [AuthGuard]},
  // {path: 'members', loadChildren:'./members/members.module#MembersModule'},
  {path: 'members', component: MemberListComponent, canActivate: [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {
}
