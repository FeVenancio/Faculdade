import { Routes } from '@angular/router';
import { ListProducts } from './list-products/list-products';
import { RegisterProduct } from './register-product/register-product';

export const routes: Routes = [
    {path: 'list', component: ListProducts},
    {path: 'register', component: RegisterProduct}
];
