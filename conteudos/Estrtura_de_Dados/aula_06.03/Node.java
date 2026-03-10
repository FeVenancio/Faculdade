import java.util.LinkedList;

public class Node {
    
    Node next;
    String data;
    Node head = null;

    LinkedList nodeList = new LinkedList<>();

    public void Append(String value) {
        // inserção de nó
        Node node = new Node();
        node.data = value;
        node.next = head;

        nodeList.

        head = node;
    }
}
