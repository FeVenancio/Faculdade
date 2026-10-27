import { Component } from '@angular/core';
import { ProductService } from '../Services/product-service';

@Component({
  imports: [],
  selector: 'app-lista-produtos',
  styleUrl: './lista-produtos.css',
  templateUrl: './lista-produtos.html',
})
export class ListaProdutos {

  produtos: string[];

  constructor(private productService: ProductService) {
    this.produtos = this.productService.listar();
  }
}
