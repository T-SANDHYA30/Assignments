import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class A {

  constructor(){}

  aMethod(){
    console.log("a method")
  }
  
}
