import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ErrorService } from '../../services/error-service';

@Component({
  selector: 'app-crashcomponent',
  imports: [RouterModule],
  templateUrl: './crashcomponent.html',
  styleUrl: './crashcomponent.css',
})
export class Crashcomponent {

  constructor(public service:ErrorService){

  }
  // ngOnInit(){
  //   throw new Error("crash inside route")
  // }

}
