import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'maskmobilenum',
})
export class MaskmobilenumPipe implements PipeTransform {

  transform(mobilenum:string): any {
    return mobilenum.slice(0,2)+Array(7).fill('*').join('')+mobilenum.slice(-2)
  }

}
