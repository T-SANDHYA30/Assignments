import { HttpClient } from '@angular/common/http';
import { Component, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../../models/employee.model';
const BASE_URL="http://localhost:4000/employees"

// @Component({
//   selector: 'app-empservice',
//   imports: [],
//   templateUrl: './empservice.html',
//   styleUrl: './empservice.css',
// })

@Injectable({
  providedIn: 'root',
})
export class Empservice {
  delete(eid: number) {
    return this.http.delete<void>(`${BASE_URL}/${eid}`);
  }

  constructor(private http:HttpClient){}

  findAll():Observable<Employee[]>{
    return this.http.get<Employee[]>(BASE_URL);
  }

  save(emp:Employee):Observable<Employee>{
    return this.http.post<Employee>(BASE_URL,emp);
  }

  findById(eid:number):Observable<Employee>{
    return this.http.get<Employee>(`${BASE_URL}/${eid}`);
  }

  update(eid:number, employee:Employee):Observable<Employee>{
    return this.http.put<Employee>(`${BASE_URL}/${eid}`,employee);
  }

}
