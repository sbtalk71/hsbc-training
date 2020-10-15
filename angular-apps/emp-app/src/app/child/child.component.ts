import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() parentData:String;

  public data:String="";
  constructor() { }

  ngOnInit(): void {
    this.data=this.parentData;
  }

}
