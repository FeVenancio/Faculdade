import { Component, inject } from '@angular/core';
import { ListaTarefas } from '../lista-tarefas/lista-tarefas';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';
import { TarefaService } from '../Service/tarefa-service';

@Component({
  imports: [FormsModule, RouterLink],
  selector: 'app-cadastrar-componentes',
  styleUrl: './cadastrar-componentes.css',
  templateUrl: './cadastrar-componentes.html',
})
export class CadastrarComponentes {

  private tarefaService = inject(TarefaService);

  titulo: string = '';
  descricao: string = '';
  prazoConclusao: string = '';

  adicionarTarefas(): void {
    if (!this.titulo.trim() || !this.descricao.trim() || !this.prazoConclusao) {
      return;
    }

    this.tarefaService.adicionarTarefas(
      this.titulo,
      this.descricao,
      new Date(this.prazoConclusao + 'T00:00:00')
    );

    this.titulo = '';
    this.descricao = '';
    this.prazoConclusao = '';
  }
}
