package ex1;
public class LinkedList {
    
    private Node head = null;
    private Node url = null;

    public void visitar(String url) {

        Node node = new Node(url);
        node.next = head;
        head = node;
        this.url = head;
    }

    public String voltar() {

        if (head == null) {
            return "Não contém URL";
        }

        Node node = url;

        if (node.next == null) {
            url = null;
            return "Não existem mais páginas.";
        }
        url = node.next;
        return url.data;            
    }

    public String avancar() {

        if (url.equals(head)) {
            return "Não é possível avançar";
        }

        Node node = head;

        if (node.next.equals(url)) {
            url = node;
            return url.data;
        } else {
            node = node.next;
        }

        while (node != url) {

            if (node.next.equals(url)) {
                url = node;
                return url.data;
            }
            node = node.next;
        }
        return null;
    }
}
