package ex2;

public class AtendimentoHospital {

    private int senha = 1;
    private Node front;
    private Node rear;

    public AtendimentoHospital() {
        front = null;
        rear = null;
    }

    public void chegada(String nome) {

        Paciente pac = new Paciente(nome, senha);
        senha++;

        Node node = new Node(pac);

        if (front == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public Paciente chamarProximo() {

        if (front == null) 
            throw new RuntimeException("Fila vazia"); 

        Paciente pac = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return pac;
    }
}
