import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-mural-recados',
  styleUrl: './mural-recados.css',
  templateUrl: './mural-recados.html',
})
export class MuralRecados {

  listaRecados: string[] = ['Proibido celular na resenha', 'proibido fiel', 'proibido gestante', 'proibido trair'];
  selecionado: string = '';
  novoRecado: string = '';
  recadoVerificado: boolean = false;
  contador: number = 0;
  verificacao: string = 'Não lido';
  

  adicionarRecado() {
    
    this.listaRecados.push(this.novoRecado);
    this.novoRecado = '';
  }

  verificar() {
    if (this.recadoVerificado) {
      this.verificacao = 'Lido';
      let cor = document.getElementById('cor');
      if (cor) {
        cor.style.color = 'blue';
      }
    } else {
      this.verificacao = 'Não lido';
      let cor = document.getElementById('cor');
      if (cor) {
        cor.style.color = 'black';
      }
    }
  }

}
