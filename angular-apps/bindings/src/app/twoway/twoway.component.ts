import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twoway',
  template: `
    <h1>{{title}}</h1>
    <hr>
    <input type="text" name="username" value="" #textInput>
    <input type="text" name="username" value="" [(ngModel)]="data">
    <button (click)="onClick(textInput.value)">UpdateText</button><br/>
    <h2>{{data}}</h2>
  `,
  styles: [
  ]
})
export class TwowayComponent implements OnInit {
  title = "Learning Angular Two Way Binding";

  public data:String="some text";

  constructor() { }

  ngOnInit(): void {
  }

  public onClick(value:String){

    this.data=value;
  }

}
