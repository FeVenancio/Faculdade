package ex4;

class Node {
    int codigo;
    String nome;
    Node esquerda;
    Node direita;

    public Node(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        esquerda = null;
        direita = null;
    }
}
