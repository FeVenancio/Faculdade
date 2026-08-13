package ex7;

class No {
    String nome;
    No proximo;

    public No(String nome) {
        this.nome = nome;
        this.proximo = this; // Aponta para si mesmo inicialmente (circular)
    }
}
