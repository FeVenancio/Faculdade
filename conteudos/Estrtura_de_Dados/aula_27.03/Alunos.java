public class Alunos {
    private String nome;
    private int ra;
    private String data;

    public Alunos(String nome, int ra, String data) {
        this.nome = nome;
        this.ra = ra;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}