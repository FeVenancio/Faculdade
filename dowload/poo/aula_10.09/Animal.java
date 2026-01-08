public class Animal {
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;
    private boolean vivo;

    public Animal(int felicidade, int energia, boolean vivo) {
        this.felicidade = felicidade;
        this.energia = energia;
        this.vivo = vivo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public boolean getVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public String animal() {
        return
        "NOME: " + nome + "\nTIPO: " + tipo + "\nIDADE: " + idade + " anos";
    }
    public void alimnetar() {
        System.out.println("Animal se alimentando...");
        energia += 10;
    }
    public void brincar() {
        System.out.println("Animal brincando...");
        felicidade += 10;
        energia -= 5;
    }
    public void dormir() {
        System.out.println("Animal dormindo...");
        energia = 100;
    }
    public boolean checkVivo() {
        if (energia <= 0){
            vivo = false;
        }
        return vivo;
    }
    public String mostrarStatus() {
        return
        "------ STATUS DO ANIMAL ------" + "\nNOME: " + nome + " (" + tipo + ")" +
        "\nIDADE: " + idade + "\nENERGIA: " + energia + "\nFELICIDADE: " + felicidade +
        "\nVIVO: " + vivo; 
    }
}
