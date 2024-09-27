import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  public cust:ICustomer;
  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
    this.cust={customerId:0, customerName:"", mobile:""};
  }

  public findById(customerId:number)
  {
    this._service.getCustomerById(customerId).subscribe(value=>this.cust=value);
  }


}
