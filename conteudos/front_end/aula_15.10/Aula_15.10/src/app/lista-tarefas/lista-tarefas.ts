import { Component, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { Tarefa, TarefaService } from '../Service/tarefa-service';

@Component({
  selector: 'app-lista-tarefas',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './lista-tarefas.html',
  styleUrl: './lista-tarefas.css'
})
export class ListaTarefas {

  private tarefaService = inject(TarefaService);

  get tarefas(): Tarefa[] {
    return this.tarefaService.listarTarefas();
  }

  contarConcluidas(): number {
    return this.tarefas.filter(
      tarefa => tarefa.dataConclusao !== null
    ).length;
  }

  contarPendentes(): number {
    return this.tarefas.filter(
      tarefa => tarefa.dataConclusao === null
    ).length;
  }

  marcarConcluida(tarefa: Tarefa): void {
    this.tarefaService.marcarConcluida(tarefa);
  }

  removerTarefa(tarefa: Tarefa): void {
    this.tarefaService.removerTarefas(tarefa);
  }
}
