public class LinkedList {
    Node head = null;

    void insert(String value) {

        Node node = new Node();         // node.data = thi
        node.data = value;              // node.next = null
        node.next = head;               // head = thi
                                        // node.data = joao
        head = node;                    // node.next = thi
    }                                   // node.data = dudu
                                        // node.next = joao
    void print() {                      
        Node n = head;  
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    void remove(String value) {

        if (head == null)
            return;

        if (value.equals(head.data)) {
            head = head.next;
            return;
        }

        Node n = head;

        while (n.next != null) {
            if (value.equals(n.next.data)) {
                n.next = n.next.next;
                return;
            }

            n = n.next;
        }
    }

    Node find(String value) {

        Node n = head;

        while (n != null) {
            if (value.equals(n.data)) {
                return n;
            }          
            n = n.next;
        }
        return null;
    }

    void printRe(Node n) {

        if (n == null) {
            System.out.println("null");
            return;
        }
        
        printRe(n.next);
        System.out.print(n.data + " -> "); // divisão conquista
    }
}
