import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FindCustomerComponent } from './find-customer/find-customer.component';
import { ListCustomersComponent } from './list-customers/list-customers.component';
import { SaveCustomerComponent } from './save-customer/save-customer.component';

const routes: Routes = [
  {path:"findCust",component:FindCustomerComponent},
  {path:"listCust",component:ListCustomersComponent},
  {path:"saveCust",component:SaveCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
