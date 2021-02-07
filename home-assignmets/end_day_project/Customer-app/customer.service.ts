import { HttpClient } from '@angular/common/http';
import { TagContentType } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cust } from './cust';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public respData:JSON;

  constructor(private http:HttpClient) { }

  private url="http://localhost:8080/customer/";

  public listCust():Observable<Cust[]>{
    return this.http.get<Cust[]>(this.url);
  }

  public findCust(id:number):Observable<Cust>{
    return this.http.get<Cust>(this.url+"find/"+id);
  }

  public saveCust(c1:Cust):Observable<any>{
    
  //   const headers={'Content-Type':'application/json', 'Accept':'text/plain'}
  //  this.http.post<String>(this.url+"save",c1,{headers, responseType:'text' as 'json'}).subscribe(data=>this.respData=data);
  //     console.log(this.respData);
  //  return this.respData;
    return this.http.post<any>(this.url+"save",c1);
  }
  
}
