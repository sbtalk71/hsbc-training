import { Component, OnInit } from '@angular/core';
import { empdata } from '../empdata';

@Component({
  selector: 'app-if-for-component',
  templateUrl: './if-for-component.component.html',
  styleUrls: ['./if-for-component.component.css']
})
export class IfForComponentComponent implements OnInit {


  public empList=empdata;
  constructor() { }

  ngOnInit(): void {
  }

}
