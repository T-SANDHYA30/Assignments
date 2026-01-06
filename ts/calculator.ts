interface Calculator{
    add:(a:number,b:number)=>number
    sub:(a:number,b:number)=>number
    mul:(a:number,b:number)=>number
    div:(a:number,b:number)=>number
}

let calc:Calculator={
    add:(a,b)=>a+b,
    sub:(a,b)=>a-b,
    mul:(a,b)=>a*b,
    div:(a,b)=>a/b
}

console.log(calc.add(4,5))
console.log(calc.sub(7,2))
console.log(calc.mul(2,3))
console.log(calc.div(90,6))
