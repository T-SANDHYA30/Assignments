import { Component } from '@angular/core';
import { Employee } from '../../models/employee.model';
import { ActivatedRoute } from '@angular/router';
import { Empservice } from '../../services/empservice/empservice';
import { Observable } from 'rxjs';

const BASE_URL = "http://localhost:4000/employees";

@Component({
  selector: 'app-emp-info',
  imports: [],
  templateUrl: './emp-info.html',
  styleUrl: './emp-info.css',
})
export class EmpInfo {
  // emplist:Employee[]=[]
  empid!:number
  emp?:Employee


   ngOnInit():void{
  
      // this.emplist=[new Employee(12,'renu','trainer','renu@gmail.com','963852741',89000,'IT'),
      // new Employee(121,'sindu','testing','sindu@gmail.com','789456123',70000,'IT'),
      // new Employee(34,'nandu','programmer','nandu@gmail.com','741852963',34666,'IT')
    //]
      this.empid=Number(this.route.snapshot.paramMap.get('eid'))
      this.service.findById(this.empid).subscribe(()=>{
        (data:any)=>this.emp=data
      })
    //  this.findById();

   }

   constructor(private route:ActivatedRoute, private service:Empservice){}

    // findById(eid:number):Observable<Employee>{
    //    return this.http.get<Employee>(`${BASE_URL}/${eid}`);
    //  }

   //findById():void{
  //   const id=this.empid;
  //   const id=121;
  //   this.emp=this.emplist.find(e=>e.eid===id)

 //  }
  }
  
