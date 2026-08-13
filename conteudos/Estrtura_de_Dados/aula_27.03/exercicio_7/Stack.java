public class Stack {

    private Node top = null;

    public void push(int value) {

        int valor = 128;

        for(int i = 0; i < 8; i++) { // 1, 2, 4, 8, 16, 32, 64, 128

            if (value >= valor) {
            Node node = new Node(1);
            node.next = top;
            top = node;
            value -= valor;

            } else {
                Node node = new Node(0);
                node.next = top;
                top = node;
            }
            valor = valor / 2;
        }
    }

    public void printInverso() {
        printInverso(top);
    }

    public void printInverso(Node node) {

        if (node == null) return;

        printInverso(node.next);
        System.out.print(node.data + " ");
    }
}