import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input() parentData: String;

  @Output() public childEvent = new EventEmitter();

  public data: String = "";
  constructor() { }

  ngOnInit(): void {
    this.data = this.parentData;
  }
  public fireEvent() {
    this.childEvent.emit("Hello from Child..")
  }
}
