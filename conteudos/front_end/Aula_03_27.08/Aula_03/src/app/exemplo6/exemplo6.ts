import { Component } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-exemplo6',
  styleUrl: './exemplo6.css',
  templateUrl: './exemplo6.html',
})
export class Exemplo6 {
  frutas: string[] = ['Maça', 'Banana', 'Laranja', 'Uva', 'Pera', 'Lixia', 'Morango', 'Abacaxi', 'Melancia', 'Caju', 'Acerola', 'Coco', 'Manga', 'Jabuticaba', 'Goiaba'];
  
  selecionada: string = '';
}
