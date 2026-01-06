import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-student',
  imports: [CommonModule, FormsModule],
  templateUrl: './student.html',
  styleUrl: './student.css',
})
export class Student {

  stud=[
    {sid:123,sname:'sandhya',marks:100,},
    {sid:134,sname:'sowmya',marks:20,},
    {sid:125,sname:'abhi',marks:70,},
    {sid:126,sname:'nandu',marks:90,},
    {sid:127,sname:'viswa',marks:55,},



  ]

}
