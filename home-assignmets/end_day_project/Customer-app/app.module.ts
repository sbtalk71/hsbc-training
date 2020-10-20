import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FindCustomerComponent } from './find-customer/find-customer.component';
import { ListCustomersComponent } from './list-customers/list-customers.component';
import { CustomerService } from './customer.service';
import {HttpClientModule} from '@angular/common/http';
import { SaveCustomerComponent } from './save-customer/save-customer.component';

@NgModule({
  declarations: [
    AppComponent,
    FindCustomerComponent,
    ListCustomersComponent,
    SaveCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
