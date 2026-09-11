import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-exemplo9',
  styleUrl: './exemplo9.css',
  templateUrl: './exemplo9.html',
})
export class Exemplo9 {

  email: string = '';

  enviar() {
    if (this.email.includes('@')) {
      alert(`email enviado para: ${this.email}`);
    } else {
      alert('Email inválido!');
    }
    
  }
}
