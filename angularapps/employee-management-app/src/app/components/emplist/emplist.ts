import { Component, signal } from '@angular/core';
import { Employee } from '../../models/employee.model';
import { Router, RouterModule } from '@angular/router';
import { Empservice } from '../../services/empservice/empservice';

@Component({
  selector: 'app-emplist',
  imports: [RouterModule],
  templateUrl: './emplist.html',
  styleUrls: ['./emplist.css'],
})
export class Emplist {

  emplist=signal<Employee[]>([])
  constructor(private router:Router, private service:Empservice){}

  ngOnInit():void{

    this.service.findAll().subscribe(data=>this.emplist.set(data))

    // this.emplist=[new Employee(12,'renu','trainer','renu@gmail.com','963852741',89000,'IT'),
    // new Employee(121,'sindu','testing','sindu@gmail.com','789456123',70000,'IT'),
    // new Employee(34,'nandu','programmer','nandu@gmail.com','741852963',34666,'IT')]

  }

  

  delete(eid:number){
    // alert("do you want to delete")
    // console.log("deleted successfully")
    confirm("do you want to delete")
    this.service.delete(eid).subscribe(()=>{
      console.log("deleted")
    })
    this.router.navigate(['/emp/list'])
  }

}
