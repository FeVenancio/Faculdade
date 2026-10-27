import { Component } from '@angular/core';
import { InjecaoDependenciaProduto } from '../injecao-dependencia-produto/injecao-dependencia-produto';

@Component({
  imports: [],
  selector: 'app-injecao-dependencia-produto-catalogo',
  styleUrl: './injecao-dependencia-produto-catalogo.css',
  templateUrl: './injecao-dependencia-produto-catalogo.html',
})
export class InjecaoDependenciaProdutoCatalogo {

  produtos: string[] = [];
  constructor(private productC: InjecaoDependenciaProduto) {
    this.produtos = this.productC.listar();
  }
}
