package ex6;

public class Main {
    public static void main(String[] args) {

        RankingJogadores ranking = new RankingJogadores();

        
        ranking.cadastrar("Thiago", 500);
        ranking.cadastrar("João", 300);
        ranking.cadastrar("Guilherme", 800);
        ranking.cadastrar("Daniel", 150);
        
        ranking.exibirCrescente();
        System.out.println();
        ranking.exibirDecrescente();
        System.out.println();
  
        ranking.atualizar("João", 900);
        ranking.exibirCrescente();
        System.out.println();

        ranking.buscarPorNome("Thiago");
        ranking.remover("Daniel");
        ranking.exibirCrescente();
    }
}
