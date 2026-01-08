public class Capivara extends Animal {
    private int peso;

    public Capivara() {

    }
    public Capivara(String nome, int idade, int peso) {
        super(nome, idade);
        this.peso = peso;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String imprimir() {
        String msg = "--- Capivara ---" +
                super.imprimir() +
                "\nPeso: " + getPeso();
        return msg;
    }
    public String falar() {
        String msg = "Roinc Roinc";
        return msg;
    }
}
