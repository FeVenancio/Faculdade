package ex7;

class GerenciadorTurnos {
    private No atual; 

    public GerenciadorTurnos() {
        this.atual = null;
    }

    public void adicionarJogador(String nome) {
        No novoNo = new No(nome);
        
        if (atual == null) {
            atual = novoNo;
        } else {
            
            No temp = atual;
            while (temp.proximo != atual) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo; 
            novoNo.proximo = atual; 
        }
        System.out.println("Jogador adicionado: " + nome);
    }

    public void passarTurno() {
        if (atual != null) {
            atual = atual.proximo;
            System.out.println("-> Turno passado. Agora é a vez de: " + atual.nome);
        } else {
            System.out.println("Não há jogadores na partida.");
        }
    }

    public void removerJogadorAtual() {
        if (atual == null) {
            System.out.println("Nenhum jogador para remover.");
            return;
        }
        
        if (atual.proximo == atual) {
            System.out.println("Jogador " + atual.nome + " removido. A partida acabou!");
            atual = null;
            return;
        }

        No anterior = atual;
        while (anterior.proximo != atual) {
            anterior = anterior.proximo;
        }

        System.out.println("Jogador " + atual.nome + " foi eliminado.");
        
        anterior.proximo = atual.proximo;
        
        atual = atual.proximo; 
        System.out.println("-> A vez passou automaticamente para: " + atual.nome);
    }

    public void exibirJogadores() {
        if (atual == null) {
            System.out.println("A roda está vazia.");
            return;
        }
        
        System.out.print("Roda de jogadores: ");
        No temp = atual;
        do {
            System.out.print(temp.nome);
            if(temp == atual) System.out.print(" (Vez atual)");
            System.out.print(" -> ");
            temp = temp.proximo;
        } while (temp != atual);
        System.out.println("(Retorna ao início)");
    }
}
