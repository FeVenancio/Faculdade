import { Routes } from '@angular/router';
import { CadastrarComponentes } from './cadastrar-componentes/cadastrar-componentes';
import { ListaTarefas } from './lista-tarefas/lista-tarefas';

export const routes: Routes = [
  {path: '', redirectTo: 'cadastrar', pathMatch: 'full'},
  {path: 'cadastrar', component: CadastrarComponentes},
  {path: 'lista',component: ListaTarefas}
];
