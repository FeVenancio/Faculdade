import { Service } from '@angular/core';

@Service()
export class ContadorService {
    valor = 0;

    incrementar() {this.valor++;}
    decrementar() {this.valor--;}
}
