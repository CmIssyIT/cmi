import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MemberListComponent } from "./member.list.component";
import { MemberService } from "./member.service";
import { SearchFilterPipe } from './searchFilter';
import { FormsModule } from '@angular/forms';
/**
 * Module containing everything about security (e.g. Authentication guard).
 */
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
