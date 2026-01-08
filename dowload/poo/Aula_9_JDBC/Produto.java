package Aula_9_JDBC.entity;

public class Produto {
    private int id_produto;
    private String nome;
    private double valor;
    private String categoria;
    private int quantidade;

    public Produto(int id_produto, String nome, double valor, String categoria, int quantidade) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double valor, String categoria, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
