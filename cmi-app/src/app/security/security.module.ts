import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AuthGuard } from './route/auth.guard';

/**
 * Module containing everything about security (e.g. Authentication guard).
 */
@NgModule({
  imports: [
    CommonModule
  ],
  providers: [AuthGuard]
})
export class SecurityModule {

}
