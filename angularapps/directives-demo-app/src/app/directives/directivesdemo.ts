import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appDirectivesdemo]',
})
export class OnclickBoldDirective {
  private isBold=false
  constructor() { }

  @HostBinding('style.fontWeight')
  get FontWeight(){
    return this.isBold?'bold':'normal'
  }

  @HostListener('click')
  toggleBold(){
    this.isBold=!this.isBold
  }
}
export class Directivesdemo {
  constructor() { }
  private mycolor='black'
  @HostBinding('style.color')
  get color(){
    return this.mycolor?'blue':'green'
  }

  @HostListener('mouseenter')
  onEnter(){
    this.mycolor='green'
  }

  @HostListener('mouseleave')
  onLeave(){
    this.mycolor='black'
  }
}
