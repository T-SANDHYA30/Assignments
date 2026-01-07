import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appTextselectdirective]',
})
export class Textselectdirective {

  constructor() { }

  @HostBinding('style.fontStyle')
  fontStyle='normal'

  @HostListener('mouseup')
  makeItalics(){
  if((window.getSelection()?.toString()||'').trim())
    this.fontStyle='italic'
  }
}
