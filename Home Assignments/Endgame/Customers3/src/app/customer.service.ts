import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICustomer } from './icustomer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public _baseUrl="http://localhost:8081/customer/";

  constructor(private http:HttpClient) { }

  public getCustomerById(customerId:number):Observable<ICustomer>
   {
     
     return this.http.get<ICustomer>(this._baseUrl+"find/"+customerId);
   }

   public custList():Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this._baseUrl);
  }
  public addCust(cust:ICustomer):Observable<any>
  {
    const headers={'content-type':'application/json', 'Accept':'text/plain'};
    return this.http.post<any>(this._baseUrl+"save/",cust,{headers,responseType:'text' as 'json'});


  }
}
