import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Builtinpipes } from './components/builtinpipes/builtinpipes';
import { Custompipes } from './components/custompipes/custompipes';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Builtinpipes, Custompipes],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipedemo-app');
}
