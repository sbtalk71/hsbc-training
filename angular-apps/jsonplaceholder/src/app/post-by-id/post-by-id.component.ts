import { Component, OnInit } from '@angular/core';
import { JsonDataService } from '../json-data.service';
import { Post } from '../post';

@Component({
  selector: 'app-post-by-id',
  templateUrl: './post-by-id.component.html',
  styleUrls: ['./post-by-id.component.css']
})
export class PostByIdComponent implements OnInit {

  public post:Post;
  public count:number=20;
  constructor(private _service:JsonDataService) { }

  ngOnInit(): void {
    this.post={userId:0,id:0,title:'',body:''};
  }

  public showPost(id:number){
    this._service.getPostById(id).subscribe(value=>this.post=value);
  }
}
