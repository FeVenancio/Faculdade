import { Service } from '@angular/core';

@Service()
export class ProductService {
    private products = ['Mouse', 'Teclado', 'Monitor'];

    listar(): string[] {
        return this.products;
    }
}
