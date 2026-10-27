import { Component, inject } from '@angular/core';
import { InscricaoService } from '../Services/inscricao-service';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  imports: [FormsModule, RouterLink],
  selector: 'app-cadastrar-inscricao',
  styleUrl: './cadastrar-inscricao.css',
  templateUrl: './cadastrar-inscricao.html',
})
export class CadastrarInscricao {

  private incricaoService = inject(InscricaoService);

  nome: string = '';
  email: string = '';
  oficina: string = '';

  adicionar(): void {

    if (!this.nome.trim() || !this.email.trim() || !this.oficina.trim()) {
      return;
    }
    this.incricaoService.adicionar(this.nome, this.email, this.oficina);

    this.nome = '';
    this.email = '';
    this.oficina = '';
  }

}
