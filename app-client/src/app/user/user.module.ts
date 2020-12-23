import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from "../shared/shared.module";
import { CarsJournalComponent } from './cars/cars-journal/cars-journal.component';


@NgModule({
  declarations: [CarsJournalComponent],
  imports: [
    CommonModule,
    SharedModule,
  ]
})
export class UserModule {
}
