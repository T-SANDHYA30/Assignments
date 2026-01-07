import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [CommonModule, FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {

  uname:string=''
  upwd: string=''
  msg=''
  status=''

  login(){
    if(this.uname==='admin'&&this.upwd==='admin123'){
      this.msg="login successfull"
      this.status='success'
    }
    else{
    this.msg="invalid credentials"
    this.status='unsuccessful'
  }
}

}
