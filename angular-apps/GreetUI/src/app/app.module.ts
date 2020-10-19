import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetViewComponent } from './greet-view/greet-view.component';
import { GreetService } from './greet.service';

@NgModule({
  declarations: [
    AppComponent,
    GreetViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [GreetService],
  bootstrap: [AppComponent]
})
export class AppModule { }
