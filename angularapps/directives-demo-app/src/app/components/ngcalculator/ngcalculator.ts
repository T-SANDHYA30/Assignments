import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule} from '@angular/forms';

@Component({
  selector: 'app-ngcalculator',
  imports: [FormsModule, CommonModule],
  templateUrl: './ngcalculator.html',
  styleUrl: './ngcalculator.css',
})
export class Ngcalculator {

  num1!:number       //we can write in any way   num2!:number
  num2!:number
  op=''
  res:number|null=null

  calc(op:string){
    this.op=op
    switch(this.op){
      case 'add':this.res=this.num1+this.num2;
      break;
      case 'sub':this.res=this.num1-this.num2;
      break;
      case 'mul':this.res=this.num1*this.num2;
      break;
      case 'div':this.res=this.num1/this.num2;
      break;
    }
  }

}

