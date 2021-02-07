import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';
import { ListAllComponent } from './list-all/list-all.component';

const routes: Routes = [
  {path:"customer-details", component:CustomerDetailsComponent},
  {path:"list-all", component:ListAllComponent},
  {path:"add-customer", component:AddCustomerComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
