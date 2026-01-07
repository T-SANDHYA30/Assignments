import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path:'',
        pathMatch:'full',
        redirectTo:'emp/list'
    },
    {
        path:'emp/add',
        loadComponent:()=>import("./components/addemp/addemp")
        .then(m=>m.Addemp)
    },
    {
        path:'emp/list',
        loadComponent:()=>import("./components/emplist/emplist")
        .then(m=>m.Emplist)
    },
    {
        path:'emp/info/:eid',
        loadComponent:()=>import("./components/emp-info/emp-info")
        .then(m=>m.EmpInfo)
    },
    {
        path:'emp/update/:eid',
        loadComponent:()=>import("./components/empupdate/empupdate")
        .then(m=>m.Empupdate)
    }
];
