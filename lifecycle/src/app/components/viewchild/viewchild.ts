import { AfterViewInit, Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-viewchild',
  imports: [],
  templateUrl: './viewchild.html',
  styleUrl: './viewchild.css',
})
export class Viewchild implements AfterViewInit{

  @ViewChild('uname') uname!:ElementRef
  ngAfterViewInit(): void {
    this.uname.nativeElement.focus();
  }

  focusInput(){
    this.uname.nativeElement.focus();

  }

  readData(){
    console.log(this.uname.nativeElement.value)
  }
}
