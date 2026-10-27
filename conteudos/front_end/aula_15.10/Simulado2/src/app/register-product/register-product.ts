import { Component, inject } from '@angular/core'
import { ProductService } from '../Services/product-service'
import { RouterLink } from '@angular/router'
import { FormsModule } from '@angular/forms'

@Component({
  imports: [RouterLink, FormsModule],
  selector: 'app-register-product',
  styleUrl: './register-product.css',
  templateUrl: './register-product.html',
})
export class RegisterProduct {

  private productService = inject(ProductService);

  nameProduct: string = '';
  priceProduct: number = 0;

  add(): void {

    if(!this.nameProduct.trim() || this.priceProduct <= 0) {
      return;
    }
      
    this.productService.add(this.nameProduct, this.priceProduct);

    this.nameProduct = '';
    this.priceProduct = 0;
  }
}
