import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ngswitch',
  imports: [CommonModule],
  templateUrl: './ngswitch.html',
  styleUrl: './ngswitch.css',
})
export class Ngswitch {
  choice="home"
  setChoice(choice:string){
    this.choice=choice
  }

}
