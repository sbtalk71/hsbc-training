import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent implements OnInit {

  @Input() ParentData: number;

  @Output() childEvent = new EventEmitter()
  constructor() { 

  }
  onChange(value) {
    this.childEvent.emit(value);
  }

  ngOnInit(): void {
  }

}

