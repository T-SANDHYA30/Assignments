import { Injectable, signal } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ErrorService {

  private _error=signal<string|null>(null)
  error=this._error.asReadonly();
  setError(msg:string){
    this._error.set(msg)
  }
  clear(){
    this._error.set(null)
  }
  
}
