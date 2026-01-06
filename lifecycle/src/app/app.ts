import { Component, signal, viewChild } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Lc } from './components/lc/lc';
import { Viewchild } from './components/viewchild/viewchild';
import { Parent } from './components/parent/parent';
import { Parentcontent } from './components/parentcontent/parentcontent';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Lc, Viewchild, Parent,Parentcontent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('lifecycle');
}
