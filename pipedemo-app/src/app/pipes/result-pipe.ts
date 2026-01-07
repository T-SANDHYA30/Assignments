import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'result',
})
export class ResultPipe implements PipeTransform {

  transform(result:string): any {
    if(result==='pass') return 'text-success'
    if(result==='fail') return 'text-danger'
  }

}
