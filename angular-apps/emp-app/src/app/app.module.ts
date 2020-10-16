import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { ChildComponent } from './child/child.component';
import { EmpIdlistComponent } from './emp-idlist/emp-idlist.component';
import { EmpService } from './emp.service';
import { EmpJsonComponent } from './emp-json/emp-json.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpDetailsComponent,
    ChildComponent,
    EmpIdlistComponent,
    EmpJsonComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [EmpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
