public class LinkedList {
    Node head = null;
    // adcionar elementos na lista
    public void add(Alunos aluno) {

        Node node = new Node(aluno);
        
        node.next = head;
        head = node;
    }
    // printar todos os elementos da lista
    public void print() {

        Node node = new Node();
        node = head;

        while(node != null) {
            System.out.println(node.aluno.getNome());
            node = node.next;
        }
    }
    // pegar elemento por índice 
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
    // juntar duas listas
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
    // trocar dois alunos de lugar
    public void trocar(Alunos al1, Alunos al2) {

        Node node = head;

        while (node != null) {

            if (al1.equals(node.aluno)) {
                
                Node node2 = head;

                while (node2 != null) {

                    if (al2.equals(node2.aluno)) {
                        node.aluno = al2;
                        node2.aluno = al1;
                        return;
                    }
                    node2 = node2.next;
                }
            }
            node = node.next;
        }
    }
        
}
