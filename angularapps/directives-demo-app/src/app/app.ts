import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NgIf } from './components/ng-if/ng-if';
import { Ngswitch } from './components/ngswitch/ngswitch';
import { Ngcalculator } from './components/ngcalculator/ngcalculator';
import { Ngfor } from './components/ngfor/ngfor';
import { Student } from './components/student/student';
import { Login } from './components/login/login';
import { Demo } from './components/demo/demo';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NgIf, Ngswitch, Ngcalculator, Ngfor, Login, Demo],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('directives-demo-app');
}
