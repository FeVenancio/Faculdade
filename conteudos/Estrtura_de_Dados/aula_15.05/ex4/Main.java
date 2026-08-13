package ex4;

public class Main {
    public static void main(String[] args) {

        ArvoreProdutos arvore = new ArvoreProdutos();

        arvore.root = arvore.inserir(arvore.root, 10, "Mouse");
        arvore.root = arvore.inserir(arvore.root, 5, "Teclado");
        arvore.root = arvore.inserir(arvore.root, 20, "Monitor");
        arvore.root = arvore.inserir(arvore.root, 15, "Notebook");

        System.out.println("Produtos cadastrados:");
        arvore.emOrdem(arvore.root);

        System.out.println("\nBusca do código digitado:");
        System.out.println(arvore.buscar(arvore.root, 10));

        System.out.println("\nRemovendo produto com o código digitado...");
        arvore.root = arvore.remover(arvore.root, 15);

        System.out.println("\nProdutos após remoção:");
        arvore.emOrdem(arvore.root);
    }
}