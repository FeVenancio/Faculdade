public class LinkedList {
    
    Node head = null;

    public void add(String value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void remove(String value) {

        if (head == null) {
            System.out.println("Lista vazia");
            return;
        }

        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node node = head;

        while(node.next != null) {

            if (value.equals(node.next.data)) {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
        System.out.println("Valor não existe na lista");
    }

    public void print() {

        Node node = head;

        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public int length() {

        Node node = head;
        int contador = 0;

        while (node != null) {
            contador++;
            node = node.next;
        }
        return contador;
    }

    public boolean isEmpty() {

        if(head == null) {
            return true;
        }
        return false;
    }

    public LinkedList copia() {

        LinkedList copia = new LinkedList();

        Node node = this.head;

        while (node != null) {

            copia.add(node.data);
            node = node.next;
        }
        return copia;
    }

    public void listasIguais(LinkedList lista01, LinkedList lista02) {

        if (lista01.length() != lista02.length()) {
            System.out.println("As listas tem tamanhos diferentes.");
            return;
        }

        LinkedList copia = lista02.copia();

        Node node01 = lista01.head;
        Node node02 = copia.head;

        for (int i = 0; i < lista01.length(); i++) {

            node02 = copia.head;

            for (int j = 0; j < copia.length(); j++) {

                if (node01.data.equals(node02.data)) {
                    copia.remove(node02.data);
                    node01 = node01.next;
                    break;
                }
                node02 = node02.next;
            }
        }

        if (copia.isEmpty()) {
            System.out.println("As listas são iguais!");
        } else {
            System.out.println("As listas são diferentes!");
        } 
    }
}
