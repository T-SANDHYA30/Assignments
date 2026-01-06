export class Employee {

    // eid!:number
    // ename!:string
    // desg!:string
    // email!:string
    // mobile!:string
    // salary!:Number
    // dept!:string;

    constructor(public eid:number,
        public ename:string,
        public desg:string,
        public email:string,
        public mobile:string,
        public salary:Number,
        public dept:string
        


    ){
        this.eid=eid;
        this.ename=ename;
        this.desg=desg;
        this.email=email;
        this.mobile=mobile;
        this.salary=salary;
        this.dept=dept;
    }

   


}
