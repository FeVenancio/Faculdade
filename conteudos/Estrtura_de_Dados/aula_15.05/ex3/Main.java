package ex3;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.adicionarMusica("Imagine");
        playlist.adicionarMusica("Bohemian Rhapsody");
        playlist.adicionarMusica("Hotel California");

        playlist.exibirPlaylist();

        playlist.inserirApos("Imagine", "Hey Jude");

        System.out.println("\nApós inserção:");
        playlist.exibirPlaylist();

        playlist.removerMusica("Bohemian Rhapsody");

        System.out.println("\nApós remoção:");
        playlist.exibirPlaylist();
    }
}
