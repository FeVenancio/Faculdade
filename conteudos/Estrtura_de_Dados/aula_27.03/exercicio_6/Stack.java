public class Stack {
    
    private Node top = null;

    public void push(char value) {

        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public boolean palindromo(String palavra) {

        Node node = top;
        char letra;

        for(int i = 0; i < palavra.length(); i++) {

            letra = palavra.charAt(i);

            if (node.data != letra) {
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
