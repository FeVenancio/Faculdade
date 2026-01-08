public class Gato extends Animal {
    private int alturaSalto;

    public Gato() {

    }
    public Gato(String nome, int idade, int alturaSalto) {
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }
    public int getAlturaSalto() {
        return alturaSalto;
    }
    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }
    public String imprimir() {
        String msg = "--- Gato ---" +
                super.imprimir() +
                "\nAltura do salto: " + getAlturaSalto();
        return msg;
    }
    public String falar() {
        String msg = "Miau Miau";
        return msg;
    }
}
