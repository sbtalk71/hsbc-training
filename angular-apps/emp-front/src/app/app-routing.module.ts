import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { EmpListComponent } from './emp-list/emp-list.component';
import { HrPageComponent } from './hr-page/hr-page.component';

const routes: Routes = [
  { path: "emp-details", component: EmpDetailsComponent },
  { path: "emp-list", component: EmpListComponent },
  { path: "hr-page", component: HrPageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
