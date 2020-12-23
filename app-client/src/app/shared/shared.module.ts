import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiModule } from "../../../build/openapi";


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ApiModule,
  ],
  exports: [
    ApiModule,
  ]
})
export class SharedModule {
}
