import { Component } from '@angular/core';
import { InjecaoDependenciaLogger } from '../injecao-dependencia-logger/injecao-dependencia-logger';

@Component({
  imports: [],
  selector: 'app-injecao-dependecia',
  styleUrl: './injecao-dependecia.css',
  templateUrl: './injecao-dependecia.html',
})
export class InjecaoDependecia {
  constructor(private logger: InjecaoDependenciaLogger) {
    this.logger.log('App iniciado');
  }
}
