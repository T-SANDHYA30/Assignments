import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'even',
})
export class EvenPipe implements PipeTransform {

  transform(nums:number[]): any {
    return nums.filter(num=>num%2==0);
  }

}
