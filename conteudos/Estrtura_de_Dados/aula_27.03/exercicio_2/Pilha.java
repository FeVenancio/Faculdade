public class Pilha {
    Node topo;

    public Pilha() {
        topo = null;
    }

    public void push(String vagao) {
        Node novo = new Node(vagao);
        novo.proximo = topo;
        topo = novo;
    }

    public String pop() {
        if (topo == null) {
            return "Pilha vazia";
        }
        String valor = topo.vagao;
        topo = topo.proximo;
        return valor;
    }

    public void mostrarSaida() {
        while (topo != null) {
            System.out.println(pop());
        }
    }
}