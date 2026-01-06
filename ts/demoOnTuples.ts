let person:[number,string]=[123,"amit"];
let persons:[number,string][]=[];
console.log(person)
console.log(persons)

let arr=new Array<number>(5).fill(0)


// let mynums:readonly[number,number]=[56,88]
//let mynums=[56,78] as const
//let mynums=Object.freeze([12,34])
let mynums:[number,number]=[22,33]
let mynumsarr:number[]=[12,345,23]
mynumsarr.push(22)
mynums.push(90)


console.log(mynums)
console.log(mynumsarr)