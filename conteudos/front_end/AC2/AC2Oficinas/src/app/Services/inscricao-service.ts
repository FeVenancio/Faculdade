import { Service } from '@angular/core';

export interface Inscricao {

    nome: string;
    email: string;
    oficina: string;
    confirmacao: boolean;
}

@Service()
export class InscricaoService {

    lista: Inscricao[] = [];

    listar(): Inscricao[] {
        return this.lista;
    }

    adicionar(nome: string, email: string, oficina: string): void {
        
        const inscricao: Inscricao = {nome, email, oficina, confirmacao: false};

        this.lista.push(inscricao);
    }

    remover(inscricao: Inscricao): void {

        const index = this.lista.indexOf(inscricao);

        if (index > -1) {
            this.lista.splice(index, 1);
        }
    }

    confirmarInscricao(inscricao: Inscricao): void {
        if(this.lista.includes(inscricao)){
            inscricao.confirmacao = true; 
        }
    }
}
