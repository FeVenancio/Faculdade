import { Service } from '@angular/core';

export interface Product {

    id: number;
    name: string;
    price: number;
    available: boolean;
}

@Service()

export class ProductService {

    products: Product[] = [];
    contId: number = 1;

    list(): Product[] {
        return this.products;
    }

    add(name: string, price: number): void {

        const product: Product = {id: this.contId, name, price, available: true};

        this.products.push(product);
        this.contId++;
    }

    remove(p: Product): void {

        const index = this.products.indexOf(p);

        if(index > -1) {
            this.products.splice(index, 1);
            this.contId--;
        }
    }

    changeAvailability(p: Product): void {
        if(this.products.includes(p)) {
            p.available = !p.available;
        }
    }
}
