import { Component, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {

  @Input() appName="";

  uname!:string;
  pwd!:string;
  notify!:string;
  loginEvent: any;
  @Output() loginEvent

login(){
  event?.preventDefault()
  this.loginEvent.emit('login form submitted')
  // console.log(this.uname)
  // console.log(this.pwd)
  // alert("login successful")
  if(this.uname==="sandhya" && this.pwd==="sandhya"){
    console.log(this.uname)
    console.log(this.pwd)
    alert("login successful ")
  }
  else
  alert("invalid credentials")

}
}
