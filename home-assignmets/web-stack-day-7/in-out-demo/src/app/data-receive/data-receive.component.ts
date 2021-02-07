import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-receive',
  templateUrl: './data-receive.component.html',
  styleUrls: ['./data-receive.component.css']
})
export class DataReceiveComponent implements OnInit {

  public data="";

  @Input() message:string;
  constructor() { 
    this.data=this.message;
  }

  ngOnInit(): void {
  }

}
