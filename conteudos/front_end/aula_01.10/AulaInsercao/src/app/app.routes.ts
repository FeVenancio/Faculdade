import { Routes } from '@angular/router';
import { InjecaoDependecia } from './injecao-dependecia/injecao-dependecia';
import { InjecaoDependenciaLogger } from './injecao-dependencia-logger/injecao-dependencia-logger';
import { InjecaoDependenciaProduto } from './injecao-dependencia-produto/injecao-dependencia-produto';
import { InjecaoDependenciaProdutoCatalogo } from './injecao-dependencia-produto-catalogo/injecao-dependencia-produto-catalogo';

export const routes: Routes = [
    {path: 'teste1', component: InjecaoDependecia},
    {path: 'teste2', component: InjecaoDependenciaLogger},
    {path: 'teste3', component: InjecaoDependenciaProduto},
    {path: 'teste4', component: InjecaoDependenciaProdutoCatalogo} 
];
