import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public empList=[
    {empId:100,name:"Shantanu",city:"Hyderabad",salary:45000},
    {empId:101,name:"Pavan",city:"Pune",salary:55000},
    {empId:102,name:"Pretham",city:"Hyderabad",salary:65000},
    {empId:102,name:"Joseph",city:"Chennai",salary:75000},
    {empId:103,name:"Raja",city:"Chennai",salary:85000},
    {empId:104,name:"Ankit",city:"Gurgaon",salary:95000}
  ];

  public dataFlag=true;
  constructor() { }

  ngOnInit(): void {
  }

  public onClick(){
    this.dataFlag=false;
  }
}
