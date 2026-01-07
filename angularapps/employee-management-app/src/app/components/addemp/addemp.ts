import { Component } from '@angular/core';
import { Employee } from '../../models/employee.model';
import { CommonModule } from '@angular/common';
import { Form, FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-addemp',
  imports: [CommonModule, FormsModule],
  templateUrl: './addemp.html',
  styleUrl: './addemp.css',
})
export class Addemp {

  employee:Employee={} as Employee;

  emplist:Employee[]=[]
  ngOnInit():void{

    this.emplist=[new Employee(12,'renu','trainer','renu@gmail.com','963852741',89000,'IT'),
    new Employee(121,'sindu','testing','sindu@gmail.com','789456123',70000,'IT'),
    new Employee(34,'nandu','programmer','nandu@gmail.com','741852963',34666,'IT')]


  }
  onSubmit(empForm:NgForm){
    event?.preventDefault()

    if(empForm.invalid)return
    const emp=empForm.value
    //let emp=empForm.value
    this.employee=new Employee(emp.eid,emp.ename,emp.desg,emp.email,emp.mobile,emp.salary,emp.dept)
    //console.log(this.employee)
   //this.emplist.push(this.employee)
    //this.emplist.forEach(emp=>console.log(emp))
    //alert("form submitted successfully, employee added")

    
  }

}
