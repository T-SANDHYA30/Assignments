class Student{
    sname:string;
    sid!:number;
    // constructor(){
    //     this.sname="sandhya";
    //     this.sid=23;
    // }
    constructor(sname:string,sid:number){
        this.sname=sname;
        this.sid=sid;
    }
}
// let s=new Student();
// console.log(typeof Student)
// console.log(typeof s);
// s.sname="nandu";
// s.sid=23;
// console.log(s)
 let studArray:Student[]=[
    new Student("sandhya",23), new Student("Renuka",10)
 ];
 console.log(studArray)
 for(let i=0;i<studArray.length;i++)
    console.log(studArray[i]?.sname.toUpperCase()+" "+studArray[i]?.sid)