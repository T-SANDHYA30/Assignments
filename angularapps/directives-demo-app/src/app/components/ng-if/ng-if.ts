import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  imports: [CommonModule],
  templateUrl: './ng-if.html',
  styleUrl: './ng-if.css',
})
export class NgIf {

  isLoggedIn=false
  uname="sandhya"

  login(){
    this.isLoggedIn=!this.isLoggedIn;
  }

}
