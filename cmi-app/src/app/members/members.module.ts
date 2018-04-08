import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MemberListComponent} from './components/member-list/member-list.component';
import {MemberService} from './services/member.service';
import {SearchFilterPipe} from './pipes/search-filter.pipe';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    MemberListComponent,
    SearchFilterPipe
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  providers: [MemberService],
  bootstrap: [
    MemberListComponent
  ]
})
export class MembersModule {
}
