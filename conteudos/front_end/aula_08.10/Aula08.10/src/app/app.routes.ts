import { Routes } from '@angular/router';
import { ListaProdutos } from './lista-produtos/lista-produtos';
import { ContadorA } from './contador-a/contador-a';
import { ContadorB } from './contador-b/contador-b';

export const routes: Routes = [
    {path: 'exe1', component: ListaProdutos},
    {path: 'conta', component: ContadorA},
    {path: 'contb', component: ContadorB}
];
