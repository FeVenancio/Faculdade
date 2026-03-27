public class Stack {
    private Node top = null;

    void push(int value) {
        Node n = new Node(value);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null)
            throw new RuntimeException("Pilha vazia");

        int value = top.data;
        top = top.next;
        return value;
    }
}