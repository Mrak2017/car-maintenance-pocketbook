import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarsJournalComponent } from "./user/cars/cars-journal/cars-journal.component";

const routes: Routes = [{
  path: '',
  pathMatch: 'full',
  redirectTo: 'cars',
}, {
  path: 'cars',
  children: [{
    path: '',
    pathMatch: 'full',
    component: CarsJournalComponent,
  }]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
