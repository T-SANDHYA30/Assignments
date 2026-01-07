import { Component, signal } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { Addemp } from './components/addemp/addemp';
import { Emplist } from './components/emplist/emplist';
import { EmpInfo } from './components/emp-info/emp-info';
import { Empupdate } from './components/empupdate/empupdate';
import { Navbar } from './components/navbar/navbar';
import { Main } from './components/main/main';
import { Header } from './components/header/header';
import { Footer } from './components/footer/footer';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,HttpClientModule, Addemp, Emplist, EmpInfo, RouterModule, Empupdate, Navbar, Main, Header, Footer],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('employee-management-app');
}
