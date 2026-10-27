import { Component, inject } from '@angular/core';
import { InscricaoService } from '../Services/inscricao-service';
import { Inscricao } from '../Services/inscricao-service';
import { RouterLink } from '@angular/router';

@Component({
  imports: [RouterLink],
  selector: 'app-lista-inscricoes',
  styleUrl: './lista-inscricoes.css',
  templateUrl: './lista-inscricoes.html',
})
export class ListaInscricoes {

  nome: string = ''; 
  email: string = '';
  oficina: string = '';

  private inscricaoService = inject(InscricaoService);

  inscricao(): Inscricao[] {
    return this.inscricaoService.listar();
  }

  remover(inscricao: Inscricao): void {
    this.inscricaoService.remover(inscricao);
  }

  confirmarInscricao(inscricao: Inscricao): void{
    this.inscricaoService.confirmarInscricao(inscricao);
  }

}
