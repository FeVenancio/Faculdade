public class LinkedList {
    Node head = null;

    public void add(Alunos aluno) {

        Node node = new Node(aluno);
        
        node.next = head;
        head = node;
    }

    public void print() {

        Node node = new Node();
        node = head;

        while(node != null) {
            System.out.println(node.aluno.getNome());
            node = node.next;
        }
    }

    public Alunos get(int posicao) {

        Node node = new Node();
        node = head;
        
        int variavel = 1;
        while (variavel != posicao) {
            node = node.next;
            variavel++;
        }
        return node.aluno;
    }

    public LinkedList juntar(LinkedList lista01, LinkedList lista02) {
        
        LinkedList lista03 = new LinkedList();
        
        Node node1 = lista01.head;

        while (node1 != null) {
            lista03.add(node1.aluno);
            node1 = node1.next;
        }

        Node node2 = lista02.head;

        while (node2 != null) {
            lista03.add(node2.aluno);
            node2 = node2.next;
        }
        return lista03;
    }
        
}
