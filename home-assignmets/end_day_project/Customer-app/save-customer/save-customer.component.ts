import { Component, OnInit } from '@angular/core';
import { Cust } from '../cust';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-save-customer',
  templateUrl: './save-customer.component.html',
  styleUrls: ['./save-customer.component.css']
})
export class SaveCustomerComponent implements OnInit {

  public output:String="Status of save operation..";   
  public c1:Cust;
  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
  }

  public saveCust(id:number, name:String, mobile:number){
    this.c1={customerId:id,customerName:name,mobile:mobile};
    this._service.saveCust(this.c1).subscribe(value=>this.output=value.status);
  }

}
