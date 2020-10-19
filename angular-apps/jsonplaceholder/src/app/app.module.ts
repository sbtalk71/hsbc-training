import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { PostsComponent } from './posts/posts.component';
import { JsonDataService } from './json-data.service';
import { PostByIdComponent } from './post-by-id/post-by-id.component';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing/app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    PostsComponent,
    PostByIdComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [JsonDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
