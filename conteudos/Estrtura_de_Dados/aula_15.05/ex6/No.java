package ex6;

public class No {
    String nome;
    int pontuacao;
    No proximo;

    public No(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.proximo = null;
    }
}
