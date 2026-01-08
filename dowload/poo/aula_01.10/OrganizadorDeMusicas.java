import java.util.ArrayList;

public class OrganizadorDeMusicas {
    private ArrayList<Faixa> faixas;

    public OrganizadorDeMusicas() {
        this.faixas = new ArrayList<>();
    }

    public void adicionarFaixa(String titulo, String artista, int duracao) {
        Faixa novaFaixa = new Faixa(titulo, artista, duracao);
        faixas.add(novaFaixa);
        System.out.println("Faixa adicionada: " + novaFaixa.getTitulo());
    }

    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
        System.out.println("Faixa adicionada: " + faixa.getTitulo());
    }

    public void listarTodasAsFaixas() {
        if (faixas.isEmpty()) {
            System.out.println("A lista de músicas está vazia.");
            return;
        }

        System.out.println("\n--- Lista de Músicas (Total: " + faixas.size() + ") ---");
        for (int i = 0; i < faixas.size(); i++) {
            Faixa faixa = faixas.get(i);
            System.out.println("[" + i + "] " + faixa.toString()); 
        }
        System.out.println("----------------------------------------");
    }

    public void reproduzirFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            Faixa faixa = faixas.get(indice);
            faixa.reproduzir();
        } else {
            System.err.println("Erro: Índice de faixa inválido (" + indice + ").");
        }
    }

    public void removerFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            Faixa faixaRemovida = faixas.remove(indice);
            System.out.println("Faixa removida com sucesso: " + faixaRemovida.getTitulo());
        } else {
            System.err.println("Erro: Não foi possível remover. Índice de faixa inválido (" + indice + ").");
        }
    }
}
