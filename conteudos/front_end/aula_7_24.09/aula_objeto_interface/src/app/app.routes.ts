import { Routes } from '@angular/router';
import { ExemploInterface } from './exemplo-interface/exemplo-interface';
import { Exercicio1 } from './exercicio1/exercicio1';


export const routes: Routes = [

{path: 'pagina-inicial', component: ExemploInterface},
{path: '', component: Exercicio1}

];
