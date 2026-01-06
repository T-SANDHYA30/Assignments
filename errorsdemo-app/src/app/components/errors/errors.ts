import { Component } from '@angular/core';

type User={

  uname:string
  age:number
  id:number

  }

@Component({
  selector: 'app-errors',
  imports: [],
  templateUrl: './errors.html',
  styleUrl: './errors.css',
})
export class Errors {

  // u:User={uname:"sandhya",age:34,id:11}
  ngOnInit(){
  //   console.log(this.u)

  const pValue=document.querySelector('#id1')
  console.log(pValue?.textContent)
  if(pValue!=null)
  pValue.textContent="hello"
 }

// user={

//   uname:"sandhya",
//   age:23,
//   id:123

//   }

  // ngOnInit(){
  // console.log(this.user)
  // }


  // type User={

  //   uname:string
  //   age:number
  //   id:number
  
     }
