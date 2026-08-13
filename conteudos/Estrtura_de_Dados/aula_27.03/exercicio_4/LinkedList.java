public class LinkedList {

    Node head = null;

    public void insert(int value) {
        Node node = new Node();
        node.data = value;
        node.next = head;
        head = node;
    }

    public boolean estaOrdenada() {

        if (head == null || head.next == null) {
            return true; 
        }

        boolean crescente = true;
        boolean decrescente = true;

        Node atual = head;

        while (atual.next != null) {

            if (atual.data > atual.next.data) {
                crescente = false;
            }

            if (atual.data < atual.next.data) {
                decrescente = false;
            }

            atual = atual.next;
        }

        return crescente || decrescente;
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
