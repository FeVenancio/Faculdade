package ex5;
public class Responsavel {
    
    private int codigoResponsavel;
    private String nomeResponsavel;
    private String telefone;
    private String nomeAluno;

    public Responsavel(int codigoResponsavel, String nomeResponsavel, String telefone, String nomeAluno) {

        this.codigoResponsavel = codigoResponsavel;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
        this.nomeAluno = nomeAluno;
    }

    public Responsavel() {
    }

    public int getCodigoResponsavel() {
        return codigoResponsavel;
    }

    public void setCodigoResponsavel(int codigoResponsavel) {
        this.codigoResponsavel = codigoResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
