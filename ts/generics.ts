function sayHello<T>(t :T):void{
    console.log(t)

}
 sayHello("sandhya")

 let p={
    name:"sowmya",
    id:677
 }
 sayHello(p)

 function getName(name:string):string{
    return name.toUpperCase()

 }
 sayHello(getName("madhu"))

 class Container<T,U>{
    constructor(public t:T){}
    getValue():T{
        return this.t;
    }
 }
 

 let numContainer:Container<number>=new Container(56);
 let nameContainer:Container<string>=new Container("Asha");
 let objectContainer:Container<Object>=new numContainer(p)
 console.log(numContainer.getValue())
 console.log(numContainer.getValue())

