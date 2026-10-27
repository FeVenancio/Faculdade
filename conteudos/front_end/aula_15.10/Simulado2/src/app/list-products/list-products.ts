import { Component, inject } from '@angular/core';
import { RouterLink } from '@angular/router';
import { ProductService } from '../Services/product-service';
import { Product } from '../Services/product-service';

@Component({
  imports: [RouterLink],
  selector: 'app-list-products',
  styleUrl: './list-products.css',
  templateUrl: './list-products.html',
})
export class ListProducts {

  private productService = inject(ProductService);

  products(): Product[] {
    return this.productService.list();
  }

  availableProducts(): number {
    return this.productService.list().filter(p => p.available === true).length;
  }

  unavailableProducts(): number {
    return this.productService.list().filter(p => p.available === false).length;
  }

  changeAvailability(p: Product): void {
    this.productService.changeAvailability(p);
  }

  remove(p: Product): void {
    this.productService.remove(p);
  } 
}
