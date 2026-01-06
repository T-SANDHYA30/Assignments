import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'evenimpure',
  pure:false
})
export class EvenimpurePipe implements PipeTransform {

  transform(nums:number[]): any {
    return nums.filter(num=>num%2==0);
  }


}
