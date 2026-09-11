import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-home',
  styleUrl: './home.css',
  templateUrl: './home.html',
})
export class Home {
  nome: string = 'Felipe';
  name: string = '';

  contador: number = 0;

  incrementar() {
    this.contador++;
  }

  decrementar() {
    this.contador--;
  }

  botaoAzul() {
    document.body.style.backgroundColor = 'blue';
  }

  botaoVermelho() {
    document.body.style.backgroundColor = 'red';
  } 
}

