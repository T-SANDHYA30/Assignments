import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ReversepipePipe } from '../../pipes/reversepipe-pipe';
import { ResultPipe } from '../../pipes/result-pipe';
import { MaskmobilenumPipe } from '../../pipes/maskmobilenum-pipe';
import { EvenPipe } from '../../pipes/even-pipe';
import { EvenimpurePipe } from '../../pipes/evenimpure-pipe';

@Component({
  selector: 'app-custompipes',
  imports: [ReversepipePipe, CommonModule, ResultPipe, MaskmobilenumPipe, EvenPipe, EvenimpurePipe

  ],
  templateUrl: './custompipes.html',
  styleUrl: './custompipes.css',
})
export class Custompipes {

  // myname='swapna'
  // res='pass' 
  // result!:string
  // stud={name:'sandhya',id:2170,marks:88}
  // mobileNum='9638207418'
  nums=[1,2,3,4,5,6]

  // getResult(){
  //   this.res=this.stud.marks>35?'pass':'fail'
  //   console.log(this.res)
  // }

  pushNumber(){
    this.nums.push(11)
    this.nums.push(12)
    this.nums.push(13)
    this.nums.push(14)
    this.nums.push(15)
  }

  addNumbersImmutable(){
    this.nums=[...this.nums,11,22,33,55]
  }
}
