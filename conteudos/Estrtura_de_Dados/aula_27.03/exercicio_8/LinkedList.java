public class LinkedList {

    Node head = null;

    public void insert(int value) {
        Node node = new Node();
        node.data = value;
        node.next = head;
        head = node;
    }

    public int buscarMaior() {

        if (head == null) {
            throw new RuntimeException("Lista vazia!");
        }

        int maior = head.data;

        Node atual = head;

        while (atual != null) {

            if (atual.data > maior) {
                maior = atual.data;
            }

            atual = atual.next;
        }

        return maior;
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }
}
