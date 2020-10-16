import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { empdata } from '../empdata';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-idlist',
  templateUrl: './emp-idlist.component.html',
  styleUrls: ['./emp-idlist.component.css']
})
export class EmpIdlistComponent implements OnInit {

  public empList:IEmployee[]=empdata;
  constructor(private _service:EmpService) { }

  ngOnInit(): void {
  }

  public findEmp(id:number){
    let emp=this._service.findOneEmp(id);
    console.log(emp);
  }
}
