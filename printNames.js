//const names=["sandhya","nandu","renuka","viswa"];
//console.log(names)
//for(let i=0;i<names.length;i++)
    //document.writeln(names[i]+"<br>")

let persons=[
    {
    name:"sandhya",
    id:1,
    salary:80000,
    desg:"developer"
    },
    {
    name:"nandu",
    id:2,
    salary:80000,
    desg:"Engineer"
    },
    {
    name:"Renuka",
    id:3,
    salary:800000,
    desg:"Minister"
    },
    {
    name:"viswa",
    id:4,
    salary:800000,
    desg:"driver"
    }
]
//persons.forEach(person =>{document.writeln(person.name+"\n"+person.id+"\n"+person.salary+"\n"+person.desg)})

document.writeln("<table ><tr><th>Person Id</th><th>Person Name</th><th>Salary</th><th>Designation</th>")
persons.forEach(p=>{
    document.writeln("<tr><td>"+p.id+"</td>")
    document.writeln("<tr><td>"+p.name+"</td>")
    document.writeln("<tr><td>"+p.salary+"</td>")
    document.writeln("<tr><td>"+p.desg+"</td></tr>")
})
document.writeln("</tables>")