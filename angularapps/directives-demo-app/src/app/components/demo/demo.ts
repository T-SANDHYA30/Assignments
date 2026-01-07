import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Textselectdirective } from '../../directives/textselectdirective';

@Component({
  selector: 'app-demo',
  imports: [CommonModule, Textselectdirective],
  templateUrl: './demo.html',
  styleUrl: './demo.css',
})
export class Demo {

}
