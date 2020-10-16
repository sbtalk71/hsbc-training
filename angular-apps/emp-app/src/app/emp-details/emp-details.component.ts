import { Component, OnInit } from '@angular/core';
import { empdata } from '../empdata';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public empList:IEmployee[];

  public dataFlag=true;
  constructor() { }

  ngOnInit(): void {
  }

  public onClick(){
    this.dataFlag=false;
  }
}
