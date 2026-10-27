import { Component, Injectable } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-injecao-dependencia-produto',
  styleUrl: './injecao-dependencia-produto.css',
  templateUrl: './injecao-dependencia-produto.html',
})

@Injectable({ providedIn: 'root' })
export class InjecaoDependenciaProduto {

  produtos = ['teclado', 'mouse', 'monitor'];
  listar() { return this.produtos; }
}
