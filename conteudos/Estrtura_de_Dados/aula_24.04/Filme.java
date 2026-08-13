public class Filme {
    private String titulo;
    private int duracaoMinutos;
    private double preco;
    
    public Filme(String titulo, int duracaoMinutos, double preco) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
