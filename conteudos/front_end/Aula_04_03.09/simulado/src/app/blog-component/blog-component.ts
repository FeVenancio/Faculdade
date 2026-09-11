import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-blog-component',
  styleUrl: './blog-component.css',
  templateUrl: './blog-component.html',
})
export class BlogComponent {

  posts: Post[] = [];

  constructor() {
    this.posts.push(new Post('Primeiro Post', 'Autor 1', '2023-01-01', 'Conteúdo do Primeiro Post'));
    this.posts.push(new Post('Segundo Post', 'Autor 2', '2023-02-01', 'Conteúdo do Segundo Post'));
    this.posts.push(new Post('Terceiro Post', 'Autor 3', '2023-03-01', 'Conteúdo do Terceiro Post'));
  }

  curtir(index: number) {
    this.posts[index].numeroCurtida = (this.posts[index].numeroCurtida ?? 0) + 1;
  }
}

class Post {

  titulo: string;
  autor: string;
  dataPublicacao: string;
  conteudo: string;
  numeroCurtida: number;
  listaComentarios: string[];

  constructor(titulo: string, autor: string, dataPublicacao: string, conteudo: string) {
    this.titulo = titulo;
    this.autor = autor;
    this.dataPublicacao = dataPublicacao;
    this.conteudo = conteudo;
    this.numeroCurtida = 0;
    this.listaComentarios = [];
  }
}

