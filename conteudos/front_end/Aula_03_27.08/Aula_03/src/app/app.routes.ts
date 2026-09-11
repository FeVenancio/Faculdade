import { Routes } from '@angular/router';
import { Home } from './home/home';
import { Exemplo4 } from './exemplo4/exemplo4';
import { Exemplo5 } from './exemplo5/exemplo5';
import { Exemplo6 } from './exemplo6/exemplo6';
import { Exemplo7 } from './exemplo7/exemplo7';
import { Exemplo8 } from './exemplo8/exemplo8';
import { Exemplo9 } from './exemplo9/exemplo9';
import { Exemplo10 } from './exemplo10/exemplo10';

export const routes: Routes = [
  { path: '', component: Home },
  { path: 'exemplo4', component: Exemplo4 },
  { path: 'exemplo5', component: Exemplo5 },
  { path: 'exemplo6', component: Exemplo6 },
  { path: 'exemplo7', component: Exemplo7 },
  { path: 'exemplo8', component: Exemplo8 },
  { path: 'exemplo9', component: Exemplo9 },
  { path: 'exemplo10', component: Exemplo10 }
];
