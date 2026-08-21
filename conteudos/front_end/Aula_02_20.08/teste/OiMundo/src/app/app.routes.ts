import { Routes } from '@angular/router';
import { Home } from './home/home';
import { Contato } from './contato/contato';
import { Sobre } from './sobre/sobre';
import { Login } from './login/login';

export const routes: Routes = [
    {path: '', component: Home},
    {path: 'contato', component: Contato},
    {path: 'sobre', component: Sobre},
    {path: 'login', component: Login},
];

