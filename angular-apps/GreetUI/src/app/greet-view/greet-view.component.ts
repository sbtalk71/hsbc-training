import { Component, OnInit } from '@angular/core';
import { GreetService } from '../greet.service';

@Component({
  selector: 'app-greet-view',
  templateUrl: './greet-view.component.html',
  styleUrls: ['./greet-view.component.css']
})
export class GreetViewComponent implements OnInit {

  public greet="Greeting will Arrive here";

  constructor(private _service:GreetService) { }

  ngOnInit(): void {
  }

  public showGreeting(value:string){
    this._service.getGreeting(value).subscribe(data=>this.greet=data.greet);
  }
}
