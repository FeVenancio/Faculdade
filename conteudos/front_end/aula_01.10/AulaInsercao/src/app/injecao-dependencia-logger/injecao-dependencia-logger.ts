import { Component, Injectable } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-injecao-dependencia-logger',
  styleUrl: './injecao-dependencia-logger.css',
  templateUrl: './injecao-dependencia-logger.html',
})

@Injectable({ providedIn: 'root'})
export class InjecaoDependenciaLogger {
  log(mensagem: string) {
    console.log('LOG:', mensagem);
  }
}
