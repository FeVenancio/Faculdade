package ex3;

class Playlist {
    private Musica inicio;

    public Playlist() {
        inicio = null;
    }

    public void adicionarMusica(String titulo) {
        Musica nova = new Musica(titulo);

        if (inicio == null) {
            inicio = nova;
            return;
        }

        Musica atual = inicio;
        while (atual.proxima != null) {
            atual = atual.proxima;
        }

        atual.proxima = nova;
    }

    // Remover música pelo título
    public void removerMusica(String titulo) {
        if (inicio == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        if (inicio.titulo.equalsIgnoreCase(titulo)) {
            inicio = inicio.proxima;
            System.out.println("Música removida.");
            return;
        }

        Musica atual = inicio;

        while (atual.proxima != null && !atual.proxima.titulo.equalsIgnoreCase(titulo)) {
            atual = atual.proxima;
        }

        if (atual.proxima != null) {
            atual.proxima = atual.proxima.proxima;
            System.out.println("Música removida.");
        } else {
            System.out.println("Música não encontrada.");
        }
    }

    // Inserir música após uma música específica
    public void inserirApos(String tituloReferencia, String novoTitulo) {
        Musica atual = inicio;

        while (atual != null && !atual.titulo.equalsIgnoreCase(tituloReferencia)) {
            atual = atual.proxima;
        }

        if (atual != null) {
            Musica nova = new Musica(novoTitulo);
            nova.proxima = atual.proxima;
            atual.proxima = nova;
            System.out.println("Música inserida.");
        } else {
            System.out.println("Música de referência não encontrada.");
        }
    }

    // Exibir playlist
    public void exibirPlaylist() {
        if (inicio == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        Musica atual = inicio;

        System.out.println("Playlist:");
        while (atual != null) {
            System.out.println("- " + atual.titulo);
            atual = atual.proxima;
        }
    }
}
