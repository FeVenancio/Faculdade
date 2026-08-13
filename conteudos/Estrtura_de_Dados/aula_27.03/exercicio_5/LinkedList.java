package exercicio_5;

public class LinkedList {
    Node head = null;

    public void add(String nome) {

        Node node = new Node(nome);
        
        node.next = head;
        head = node;
    }

    public void print() {

        Node node = new Node();
        node = head;

        while(node != null) {
            System.out.println(node.nome);
            node = node.next;
        }
    }

    public String get(int posicao) {

        Node node = new Node();
        node = head;
        
        int variavel = 1;
        while (variavel != posicao) {
            node = node.next;
            variavel++;
        }
        return node.nome;
    }

    public LinkedList retornar(LinkedList lista, String valorV) {

        Node node = lista.head;

        while (node != null && !valorV.equals(node.nome)) {
            node = node.next;
        }

        if (node == null) {
            System.out.println("Valor não existe dentro da lista");
            return null;
        }
        
        System.out.println("Valor existe dentro da lista");

        LinkedList listaNova = new LinkedList();

        while(node != null) {
            listaNova.addLast(node.nome);
            node = node.next;
        }
        return listaNova;
    }

    public void addLast(String nome) {
    Node novo = new Node(nome);

    // Se a lista estiver vazia
    if (head == null) {
        head = novo;
        return;
    }

    // Percorre até o último nó
    Node atual = head;
    while (atual.next != null) {
        atual = atual.next;
    }

    // Adiciona no final
    atual.next = novo;
}
        
}
