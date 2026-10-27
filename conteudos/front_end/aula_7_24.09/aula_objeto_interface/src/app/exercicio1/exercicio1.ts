import { Component } from '@angular/core';

type Produto = {id: number, nome: string, preco: number, quantidade: number, vencimento: Date};

@Component({
  imports: [],
  selector: 'app-exercicio1',
  styleUrl: './exercicio1.css',
  templateUrl: './exercicio1.html',
})
export class Exercicio1 {

  carrinho : Produto[] = [
    {id: 1, nome: "batata", preco: 3.89, quantidade: 6, vencimento: new Date('05-07-2027')},
    {id: 2, nome: "tomate", preco: 4, quantidade: 8, vencimento: new Date('16-01-2027')},
    {id: 3, nome: "abacate", preco: 5, quantidade: 2, vencimento: new Date('09-11-2027')}
  ];
}
