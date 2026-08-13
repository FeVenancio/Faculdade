package ex6;
public class RankingJogadores {

    private No inicio;

    public RankingJogadores() {
        this.inicio = null;
    }

    public void cadastrar(String nome, int pontuacao) {
        No novoNo = new No(nome, pontuacao);

        if (inicio == null || pontuacao < inicio.pontuacao) {
            novoNo.proximo = inicio;
            inicio = novoNo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.pontuacao <= pontuacao) {
            atual = atual.proximo;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    public void remover(String nome) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (inicio.nome.equals(nome)) {
            inicio = inicio.proximo;
            System.out.println("Jogador " + nome + " removido.");
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && !atual.proximo.nome.equals(nome)) {
            atual = atual.proximo;
        }

        if (atual.proximo == null) {
            System.out.println("Jogador não encontrado!");
        } else {
            atual.proximo = atual.proximo.proximo;
            System.out.println("Jogador " + nome + " removido.");
        }
    }

    public void atualizar(String nome, int novaPontuacao) {
        remover(nome);
        cadastrar(nome, novaPontuacao);
        System.out.println("Pontuação de " + nome + " atualizada para " + novaPontuacao);
    }

    public void buscarPorNome(String nome) {
        No atual = inicio;

        while (atual != null) {
            if (atual.nome.equals(nome)) {
                System.out.println("Jogador encontrado: " + atual.nome +
                        " | Pontuação: " + atual.pontuacao);
                return;
            }
            atual = atual.proximo;
        }

        System.out.println("Jogador " + nome + " não encontrado.");
    }

    public void exibirCrescente() {
        System.out.println("=== RANKING CRESCENTE ===");
        No atual = inicio;
        int posicao = 1;

        while (atual != null) {
            System.out.println(posicao + "º " + atual.nome +
                    " - Pontuação: " + atual.pontuacao);
            atual = atual.proximo;
            posicao++;
        }
    }

    public void exibirDecrescente() {
        System.out.println("=== RANKING DECRESCENTE ===");

        No[] pilha = new No[100];
        int topo = -1;

        No atual = inicio;
        while (atual != null) {
            topo++;
            pilha[topo] = atual;
            atual = atual.proximo;
        }

        int posicao = 1;
        while (topo >= 0) {
            System.out.println(posicao + "º " + pilha[topo].nome +
                    " - Pontuação: " + pilha[topo].pontuacao);
            topo--;
            posicao++;
        }
    }
}
