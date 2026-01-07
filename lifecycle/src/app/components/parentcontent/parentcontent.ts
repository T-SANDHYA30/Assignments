import { Component } from '@angular/core';
import { Childcontent } from '../childcontent/childcontent';

@Component({
  selector: 'app-parentcontent',
  imports: [Childcontent],
  templateUrl: './parentcontent.html',
  styleUrl: './parentcontent.css',
})
export class Parentcontent {

}
