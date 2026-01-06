import { AfterViewInit, Component, ContentChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-childcontent',
  imports: [],
  templateUrl: './childcontent.html',
  styleUrl: './childcontent.css',
})
export class Childcontent implements AfterViewInit{

  @ContentChild('contentRef') contentRef!:ElementRef

  ngAfterViewInit(): void {
    console.log("child received content", this.contentRef.nativeElement.textContent)
  }

  changeContent(){
    this.contentRef.nativeElement.textContent="child modified content"
  }

}
