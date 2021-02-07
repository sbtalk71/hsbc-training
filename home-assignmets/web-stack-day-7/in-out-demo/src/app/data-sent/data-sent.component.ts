import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-data-sent',
  templateUrl: './data-sent.component.html',
  styleUrls: ['./data-sent.component.css']
})
export class DataSentComponent implements OnInit {

  @Output() public sendEvent=new EventEmitter();

  ngOnInit(): void {
  }

  public sendData(data:String) {

    this.sendEvent.emit(data);
    
  }

}
