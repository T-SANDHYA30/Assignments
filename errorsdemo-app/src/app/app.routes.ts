import { Routes } from '@angular/router';
import { Home } from './components/home/home';

export const routes: Routes = [
    {
        path:'home',
        component:Home,
    },
    {
        path:'home',
        redirectTo:'/home',
        pathMatch:'full',
    }
];
