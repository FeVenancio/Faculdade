import java.util.ArrayList;
public class Membro {
    private String nome;
    private ArrayList<Membro> lstMembros = new ArrayList<>();

    public Membro(String nome) {
        this.nome = nome;
    }
    public void addMembro(Membro membro) {
        lstMembros.add(membro);
        System.out.println("Membro adicionado com sucesco!");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
