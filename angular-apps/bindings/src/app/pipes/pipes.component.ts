import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  template: `
    <h1>{{title|uppercase}}</h1>
    <h1>{{num1|percent}}</h1>
    <h1>{{num1|percent:'3.2-6'}}</h1>
    <h1>{{num1|percent:'2.2-3'}}</h1>
    <h1>Today is {{today|date}}</h1>
    <h1>Today is {{today|date:'shortDate'}}</h1>
    <h1>Today is {{today|date:'hh:mm:ss'}}</h1>
  `,
  styles: [
  ]
})
export class PipesComponent implements OnInit {

  public title="Learning pipes";

  public today=Date.now();

  public num1:number=0.259999;
  constructor() { }

  ngOnInit(): void {
  }

}
