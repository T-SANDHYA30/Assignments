import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'reversepipe',
})
export class ReversepipePipe implements PipeTransform {

    transform(name:string):any{

      if(!name) return ''
      return name.split('').reverse().join('')
      

    }
  }
