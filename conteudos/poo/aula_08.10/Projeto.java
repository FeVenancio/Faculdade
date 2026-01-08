import java.util.ArrayList;
public class Projeto {
    private String nome;
    private String id;
    private ArrayList<Tarefa> lstTarefas = new ArrayList<>();

    public Projeto(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addTarefa(Tarefa t) {
        lstTarefas.add(t);
        System.out.println("Tarefa adicionada com sucesco!");
    }
    public ArrayList<Tarefa> getLstTarefas() {
        return lstTarefas;
    }

}
