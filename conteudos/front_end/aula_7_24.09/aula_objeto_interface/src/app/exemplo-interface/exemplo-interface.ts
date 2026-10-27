import { Component } from '@angular/core';

interface Post {
  id: number;
  titulo: string;
  conteudo: string;
  autor: string;
  data: Date;
}

@Component({
  imports: [],
  selector: 'app-exemplo-interface',
  styleUrl: './exemplo-interface.css',
  templateUrl: './exemplo-interface.html',
})
export class ExemploInterface {

  post: Post[] = [

    {
      id: 1,
      titulo: "Meu primeiro post",
      conteudo: "Este é o conteúdo do post...",
      autor: "Felipe Venâncio",
      data: new Date("2025-09-01")
    },
    {
      id: 2,
      titulo: "Typescript ajuda demais",
      conteudo: "A tipagem forte evita muitos erros e da mais segurança",
      autor: "João",
      data: new Date("2025-09-05")
    }
  ];
}
