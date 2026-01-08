import java.util.ArrayList;
public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> lstFuncionarios;

    public Funcionario(String nome) {
        this.nome = nome;
        lstFuncionarios = new ArrayList<>();
    }
}