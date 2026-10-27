import { Service } from '@angular/core';

export interface Tarefa {

    titulo: string;
    descricao: string;
    prazoConclusao: Date;
    dataConclusao: Date | null;

}

@Service()
export class TarefaService {

    listaTarefas: Tarefa[] = [];

    listarTarefas(): Tarefa[] {
        return this.listaTarefas;
    }

    

    adicionarTarefas(titulo: string, descricao: string, prazoConclusao: Date): void {

        const novaTarefa: Tarefa = {
            titulo,
            descricao,
            prazoConclusao,
            dataConclusao: null // Data de conclusão inicializada como nula
        };

        this.listaTarefas.push(novaTarefa);
    }

    removerTarefas(tarefa: Tarefa): void {
        const index = this.listaTarefas.indexOf(tarefa);
        if (index > -1) {
            this.listaTarefas.splice(index, 1);
        }
    }

    marcarConcluida(tarefa: Tarefa): void {
        if (this.listaTarefas.includes(tarefa)) {
        tarefa.dataConclusao = new Date();
        }
    }
}


