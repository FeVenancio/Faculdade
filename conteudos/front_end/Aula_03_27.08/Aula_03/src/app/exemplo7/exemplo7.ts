import { Component } from '@angular/core';
import {FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-exemplo7',
  styleUrl: './exemplo7.css',
  templateUrl: './exemplo7.html',
})
export class Exemplo7 {
  color: string = '';
}
