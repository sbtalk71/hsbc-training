import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { empdata } from './empdata';
import { IEmployee } from './iemployee';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private http:HttpClient) { }

  public empList = empdata;

  public url="/assets/data/emp.json";

  public listallEmployees() {
    return this.empList;
  }

  public findOneEmp(empId: number) {
    let emp = this.empList.filter((value)=>{return value.empId==empId?value:null});
    return emp;
  }

  public getJsondata():Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(this.url);
  }

}
