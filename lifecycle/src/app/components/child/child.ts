import { Component } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {

  name!:string
  sayHello(){
    this.name="sandhya"
    console.log(this.name)
  }

}
