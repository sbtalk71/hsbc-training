import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public btnValue="Show";
  public listFlag=false;
  public names=["Megha","Kiran","Aman","Shikha","Suman","Manan"];
  constructor() { }

  ngOnInit(): void {
  }

  public setFlag(){
    if(this.listFlag==false)
    {
      this.listFlag=true;
      this.btnValue="Hide";
    }
    else{
      this.listFlag=false;
      this.btnValue="Show";
    }
  }

}
