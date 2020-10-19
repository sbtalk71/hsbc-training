import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-json',
  templateUrl: './emp-json.component.html',
  styleUrls: ['./emp-json.component.css']
})
export class EmpJsonComponent implements OnInit {
public empList:IEmployee[];
  constructor(private _service:EmpService) { }

  ngOnInit(): void {
    this._service.getJsondata().subscribe(value=>this.empList=value)
  }

}
