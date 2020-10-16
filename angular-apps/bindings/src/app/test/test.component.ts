import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <div [hidden]="isHidden">
 
  <h1 [id]="compId">{{title}}</h1>
  <hr>
  
  <h2>{{8+9}}</h2>
  <h2 [class.text-danger]="hasError">My Name is {{'Scott'.toUpperCase()}}</h2>
  <input type="text" name="uid" [disabled]="isDisabled"/>
  <button (click)="changeState()">Toggle</button>
 </div>
 <div>
 <button (click)="showHide()">{{label}}</button>
 </div>
  `,
  styles: [`
    .text-danger {color:red}
    .text-success {color:green}
    `
  ]
  
})
export class TestComponent implements OnInit {

  public title = "Learning Bindings";

  public name: string = "hi";
  public compId = "testId";

  public isDisabled = true;
  public label="Show";

  public isHidden = true;

  public textStyle="text-danger";

  public hasError=false;

  constructor() {


  }

  ngOnInit(): void {
  }

  public showHide() {
    if (this.isHidden == true) {
      this.isHidden = false;
      this.label="Hide";
    } else {
      this.isHidden = true;
      this.label="Show";
    }
  }

  public changeState() {
    if (this.isDisabled == false) {
      this.isDisabled = true;
    } else {
      this.isDisabled = false;
    }
  }

}
