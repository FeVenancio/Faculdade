public class Pocao {
    private String nome;
    private String tipo;
    private int poder;

    public Pocao(String nome) {
        this.nome = nome;
    }
    public Pocao(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }
    public Pocao(String nome, int poder, String tipo) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }
    public void usar() {
        System.out.println("A poção " + getNome() + " foi usada!");
        System.out.println("Ela causou " + getPoder() + " de dano.");
    }
    public void usar(String alvo) {
        System.out.println("A poção " + getNome() + " foi usada em " + alvo + "!");
        System.out.println("Ela causou " + getPoder() + " de dano.");
    }
    public void usar(String alvo, int vezes) {
        System.out.println("A poção " + getNome() + " foi usada " + vezes + " vezes em " + alvo + "!");
        System.out.println("Ela causou " + getPoder() + " de dano.");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimir() {
        String msg ="\n========" + 
        "\nNome: " + nome + 
        "\nTipo: " + tipo + 
        "\nPoder: " + poder + 
        "\n========";
        System.out.println(msg);
    }
}
