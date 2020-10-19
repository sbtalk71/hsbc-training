import { Component } from '@angular/core';

@Component({
selector:"test-demo",
template:`<h1>My Test Component</h1>
<h2> My Students and Me
    <ul>
    <li  *ngFor='let name of names'>{{name}}
    </ul>

`,
styles:[]
})

export class TestComponent {

    public names:String[]=["Shantanu","Karan","Abhi","Suchit","Shubhi","Muskan"];
}