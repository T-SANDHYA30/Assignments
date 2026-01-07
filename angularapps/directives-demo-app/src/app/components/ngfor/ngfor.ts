import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  imports: [CommonModule],
  templateUrl: './ngfor.html',
  styleUrl: './ngfor.css',
})
export class Ngfor {

  items=[
    {id:1, name:'lapotop',cost:70000,},
    {id:2, name:'mobile',cost:76000,},
    {id:3, name:'printer',cost:7000,},
    {id:4, name:'mouse',cost:250,},
    {id:5, name:'charger',cost:500,},
    {id:6, name:'monitor',cost:6000,}
  ]

}
