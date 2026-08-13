public class QueueLinkedList {
    
    private Node front;
    private Node rear;

    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Filme data) {

        Node newNode = new Node(data);
        
        if (rear == null) {
            front = rear = newNode;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Filme dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        
        Filme value = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public void print() {

        while (front != null) {

            System.out.println("Título: " + front.data.getTitulo() + "\n" + 
                                "Tempo: " + front.data.getDuracaoMinutos() + "m" + "\n" +
                                "Preço: " + front.data.getPreco() + "$");
            front = front.next;
        }
    }
}
