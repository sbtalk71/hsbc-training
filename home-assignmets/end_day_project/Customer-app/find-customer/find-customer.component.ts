import { Component, OnInit } from '@angular/core';
import { Cust } from '../cust';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-find-customer',
  templateUrl: './find-customer.component.html',
  styleUrls: ['./find-customer.component.css']
})
export class FindCustomerComponent implements OnInit {

  public c1:Cust={customerId:0,customerName:"",mobile:0};

  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
  }

  public getCustDetails(id:number){
    this._service.findCust(id).subscribe(data=>this.c1=data);
  }
}
