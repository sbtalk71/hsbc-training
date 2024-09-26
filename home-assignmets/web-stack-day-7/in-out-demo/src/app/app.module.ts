import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DataSentComponent } from './data-sent/data-sent.component';
import { DataReceiveComponent } from './data-receive/data-receive.component';

@NgModule({
  declarations: [
    AppComponent,
    DataSentComponent,
    DataReceiveComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
