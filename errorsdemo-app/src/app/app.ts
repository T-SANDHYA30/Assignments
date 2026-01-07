import { Component, inject, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Errorscomponent } from './components/errorscomponent/errorscomponent';
import { Home } from './components/home/home';
import { Apiservice } from './services/apiservice';
import { load } from '../demo';
//import { Errors } from './components/errors/errors';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Errorscomponent, Home],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
   protected readonly title = signal('errorsdemo-app');
  res: any;
  // name="sandhya"

 // constructor(private service:Apiservice){}
// service=inject(Apiservice)
constructor(private a:A){}


  ngOnInit(){
    //this.service.sayHello()
    //load().subscribe((data)=>console.log(data),this.res=data)
    this.a.aMethod()
  }
}
