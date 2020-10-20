import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-list-all',
  templateUrl: './list-all.component.html',
  styleUrls: ['./list-all.component.css']
})
export class ListAllComponent implements OnInit {
  public custList:ICustomer[]=[];

  constructor(private _service:CustomerService) { }

  ngOnInit(): void {
    this.showAll();
 //  this._service.custList().subscribe(value=>this.custList=value);

  }
  public showAll(){
   
    this._service.custList().subscribe(value=>this.custList=value);
   }

}
