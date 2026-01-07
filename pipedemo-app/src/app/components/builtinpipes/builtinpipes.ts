import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-builtinpipes',
  imports: [CommonModule],
  templateUrl: './builtinpipes.html',
  styleUrl: './builtinpipes.css',
})
export class Builtinpipes {
  myname:string="sandhya";
  course:string="JAVA";
  today=new Date()
  cost=455.89
  discount=0.78

  emp={name:'sandhya', id:'3', desg:'developer'}
  names=['sandhya','renu','nandu','keerthi']
  gender="female"
  genderMap={'male':'Mr.','female':'Miss.'}
  count=10
  msgMap={'=0':'no messages', '=1':'one message', other:"# messages"}
  

}
