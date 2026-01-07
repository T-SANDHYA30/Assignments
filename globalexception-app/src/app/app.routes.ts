import { Routes } from '@angular/router';
import { Homecomponent } from './component/homecomponent/homecomponent';
import { Crashcomponent } from './component/crashcomponent/crashcomponent';

export const routes: Routes = [

    {
        path:'',component:Homecomponent
    },
    {
        path:'',component:Crashcomponent
    }
];
