import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, Input } from '@angular/core';
import { RouterLink } from '@angular/router';

const name="sandhya"
const u:User={name:"sam",age:44,id:12}
type User={

  name:string
  age:number
  id:number

  }
@Component({
  selector: 'app-errorscomponent',
  imports: [ RouterLink, CommonModule],
  templateUrl: './errorscomponent.html',
  styleUrl: './errorscomponent.css',
})
export class Errorscomponent {

  @Input()myname!:string;

  uname:string=""
  price=67.60
  nums=[1,2,3]
  mapValue= this.nums

  constructor(private http:HttpClient){}
  load():void{

  this.http.get("https://jsonplaceholder.typicode.com")
  .subscribe((data)=>console.log(data));
  }
  
  // date!:Date

  // ngOnInit(){
  //   this.add(120,23);

    // new Date(2003,3,23)

    // console.log(this.date)
  }

  // add(a:number,b:any){
  //   let x=44;
  //   return(a+b)
  // }

