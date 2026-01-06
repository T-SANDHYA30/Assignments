import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Employee } from '../../models/employee.model';
import { ActivatedRoute, Router } from '@angular/router';
import { sample } from 'rxjs';
import { Empservice } from '../../services/empservice/empservice';

@Component({
  selector: 'app-empupdate',
  imports: [CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './empupdate.html',
  styleUrl: './empupdate.css',
})
export class Empupdate {

  employee?:Employee;
  emplist:Employee[]=[]
  empid?:number;
  empform: FormGroup;
  //empform?:FormGroup


  constructor(private route:ActivatedRoute, private fb:FormBuilder, private router:Router, private service:Empservice ){
  this.empform=this.fb.group({

    eid:[{value:0,disabled:true}],
    ename:['',[Validators.required, Validators.minLength(3)]],
    desg:['',Validators.required],
    email:['',[Validators.required, Validators.pattern("^a-z0-9._%+-]+@[a-z0-9.-]")]],
    mobile:['',[Validators.required, Validators.pattern("[6789][0-9]{9}")]],
    salary:[0,[Validators.required,Validators.min(1000)]],
    dept:['',[Validators.required]]
    


  })
}



  ngOnInit():void{
  //   this.emplist=[new Employee(12,'renu','trainer','renu@gmail.com','963852741',89000,'IT'),
  //   new Employee(121,'sindu','testing','sindu@gmail.com','789456123',70000,'IT'),
  //   new Employee(34,'nandu','programmer','nandu@gmail.com','741852963',34666,'IT')
  // ]

  this.empid=Number(this.route.snapshot.paramMap.get('eid'))
  //this.employee=this.emplist.find(e=>e.eid===this.empid)
  this.service.findById(this.empid)

  this.empform?.patchValue({
    eid:this.employee?.eid,
    ename:this.employee?.ename,
    desg:this.employee?.desg,
    email:this.employee?.email,
    mobile:this.employee?.mobile,
    salary:this.employee?.salary,

    dept:this.employee?.dept
  })
}
    //constructor(private route:ActivatedRoute){}
   update(){

    if(this.empform.invalid) return;
    const updateEmp=this.empform.getRawValue();
    console.log(updateEmp)
    this.service.update(this.empid as number,updateEmp).subscribe(()=>{
      console.log("emp updated")
    })
    console.log(updateEmp)
    this.router.navigate(['/emp/list'])

   }
  


}
