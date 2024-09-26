import { Component, OnInit } from '@angular/core';
import { Cust } from '../cust';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-list-customers',
  templateUrl: './list-customers.component.html',
  styleUrls: ['./list-customers.component.css']
})
export class ListCustomersComponent implements OnInit {


  public custList:Cust[];
  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
    this._service.listCust().subscribe(data=>this.custList=data);
  }


}
