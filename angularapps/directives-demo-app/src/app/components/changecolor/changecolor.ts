import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-changecolor',
  imports: [CommonModule],
  templateUrl: './changecolor.html',
  styleUrl: './changecolor.css',
})
export class Changecolor {

  checkColor=false
  changeBGColor(){
    this.checkColor=!this.checkColor
    document.body.style.backgroundColor=this.checkColor?"cyan":"yellow"
  }

}
