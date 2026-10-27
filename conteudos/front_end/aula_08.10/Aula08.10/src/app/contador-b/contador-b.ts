import { Component } from '@angular/core';
import { ContadorService } from '../Services/contador-service';

@Component({
  imports: [],
  selector: 'app-contador-b',
  styleUrl: './contador-b.css',
  templateUrl: './contador-b.html',
})
export class ContadorB {
  constructor(public contador: ContadorService) {}
}
