import { Component } from '@angular/core';
import { ErrorService } from '../../services/error-service';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-homecomponent',
  imports: [RouterModule],
  templateUrl: './homecomponent.html',
  styleUrl: './homecomponent.css',
})
export class Homecomponent {

  constructor(public service:ErrorService){

  }

}
