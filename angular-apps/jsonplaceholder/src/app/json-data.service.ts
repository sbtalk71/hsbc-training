import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from './post';

@Injectable({
  providedIn: 'root'
})
export class JsonDataService {
private _url="https://jsonplaceholder.typicode.com/posts";

  constructor(private http:HttpClient) { }

  public getPosts():Observable<Post[]>{
    return this.http.get<Post[]>(this._url);
  }

  public getPostById(id:number):Observable<Post>{
    return this.http.get<Post>(this._url+"/"+id);
  }
}
