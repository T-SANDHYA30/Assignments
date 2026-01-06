import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, ElementRef, Input, OnChanges, OnDestroy, OnInit, SimpleChanges, ViewChild } from '@angular/core';

@Component({
  selector: 'app-lc',
  imports: [],
  templateUrl: './lc.html',
  styleUrl: './lc.css',
})
export class Lc implements OnChanges, OnInit, OnDestroy, AfterViewInit, AfterViewChecked,
AfterContentInit, AfterContentChecked, DoCheck{
  @Input() name:string='sandhya'
  @ViewChild('title') title!:ElementRef

  private timer:any
  constructor(){console.log("1.constructor called")}

  ngOnChanges(changes:SimpleChanges)
  {
    console.log("2.ngOnChanges",changes)
  }

  ngOnInit() {
    console.log("3.ngOnInit")
    this.timer=setInterval(()=>{
      console.log("timer started"),3000
    })
  }

  ngDoCheck(){
    console.log("4.ngDoCheck")
    
  }

  ngAfterContentInit(){
    console.log("5.ngAfterContentInit")
  }

  ngAfterContentChecked(){
    console.log("5.ngAfterContentChecked")
  }

  ngAfterViewInit(){
    console.log("7.ngAfterViewInit")
  }

  ngAfterViewChecked(){
    console.log("8.ngAfterViewChecked")

    
  }

  ngOnDestroy(){
    console.log("9,ngOnDestroy")
    console.log(this.timer)
    
  }

  changeName(){
    this.name="sandhya thummaluru";
  }


}
