import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IEmp } from './iemp';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  private _baseUrl = "http://localhost:8081/emp/";

  private _hrBaseUrl="http://localhost:9000/hr/emp/details";
  constructor(private http: HttpClient) { }

  public getEmpById(id: string): Observable<IEmp> {
    return this.http.get<IEmp>(this._baseUrl + "find/" + id);
  }

  public getEmpDetails(id: string): Observable<IEmp> {
    return this.http.get<IEmp>(this._hrBaseUrl + "?id=" + id);
  }
  public empList(): Observable<IEmp[]> {
    return this.http.get<IEmp[]>(this._baseUrl);
  }
}
