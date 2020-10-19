import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { GreetObj } from './greet-obj';

@Injectable({
  providedIn: 'root'
})
export class GreetService {
private _url="http://localhost:8080/greetservice/greet/";

  constructor(private http:HttpClient ) { }

  public getGreeting(name:string): Observable<GreetObj>{
    return this.http.get<GreetObj>(this._url+name);
  }
}
