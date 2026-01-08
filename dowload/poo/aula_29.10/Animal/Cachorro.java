public class Cachorro extends Animal {
    private int velocidade;

    public Cachorro() {

    }
    public Cachorro(String nome, int idade, int velocidade) {
        super(nome, idade);
        this.velocidade = velocidade;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public String imprimir() {
        String msg = "--- Cachorro ---" +
                super.imprimir() +
                "\nVelocidade: " + getVelocidade();
        return msg;
    }
    public String falar() {
        String msg = "AuAuAu";
        return msg;
    }
}
