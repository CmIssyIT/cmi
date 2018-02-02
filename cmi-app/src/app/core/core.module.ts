import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { HomeComponent } from './component/home/home.component';
import { SecurityService } from './service/security.service';
import {FooterComponent} from "./component/footer/footer.component";
import {AppRequestInterceptor} from "./service/app-request-interceptor";

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild([])
  ],
  declarations: [
    HomeComponent,
    FooterComponent
  ],
  exports: [
    FooterComponent
  ],
  providers: [
    SecurityService,
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AppRequestInterceptor,
      multi: true,
    }
  ]
})
export class CoreModule {
}
