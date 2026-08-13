package ex7;

public class Main {
    public static void main(String[] args) {
        GerenciadorTurnos jogo = new GerenciadorTurnos();

        jogo.adicionarJogador("Alice");
        jogo.adicionarJogador("Bruno");
        jogo.adicionarJogador("Carlos");
        jogo.adicionarJogador("Diana");

        System.out.println("\n--- Início do Jogo ---");
        jogo.exibirJogadores();

        System.out.println("\n--- Passando os turnos ---");
        jogo.passarTurno(); 
        jogo.passarTurno(); 
        
        System.out.println("\n--- Eliminando jogador ---");
        
        jogo.removerJogadorAtual(); 
        
        System.out.println("\n--- Situação atual ---");
        jogo.exibirJogadores();
        
        System.out.println("\n--- Continuando a roda ---");
        jogo.passarTurno();
    }
}
