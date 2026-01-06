class Person{
    constructor(public name:string, public id:number){}
    sayHello(){
        console.log("hello,"+this.name)
    }
}

class Student extends Person implements User{
    constructor(public name:string,public id:number,public coursename:string, public email:string, public pwd:string){
        super(name,id)
    }
    getInfo(){
        console.log(this.name+"registered into "+this.coursename)
    }
    getCredentials(): void {
        console.log(this.email+" "+this.pwd)
        
    }
}
let s:Student=new Student("sandhya",55,"java","sandhya@gmail.com","san23")
s.sayHello();
s.getInfo();
s.getCredentials()

interface User{
    email:string
    pwd:string
    getCredentials():void;
}

class Employee implements User{
    constructor(public email:string,public pwd:string){
        this.email=email
        this.pwd=pwd

    }

    getCredentials(): void {
        console.log(this.email+" "+this.pwd)
        
    }
}

let e:Employee=new Employee("sandhya@gmail.com","1243");
e.getCredentials();