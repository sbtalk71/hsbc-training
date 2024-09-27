import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  public cust:ICustomer;
  public status:string;
  constructor(private _service:CustomerService) { }

  ngOnInit(): void {

  }
  public addCustomer(custId:number,custName:string,mobile:string){

    this.cust={customerId:custId,customerName:custName,mobile:mobile};
    this._service.addCust(this.cust).subscribe(data=>this.status=data);
  }

}
