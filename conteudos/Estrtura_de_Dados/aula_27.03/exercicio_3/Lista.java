class Lista {
    Node inicio;

    void add(int v) {
        Node n = new Node(v);

        if (inicio == null) {
            inicio = n;
        } else {
            Node aux = inicio;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = n;
        }
    }

    Lista pares() {
        Lista nova = new Lista();
        Node aux = inicio;
        while (aux != null) {
            if (aux.valor % 2 == 0) {
                nova.add(aux.valor);
            }
            aux = aux.prox;
        }

        return nova;
    }

    void print() {
        Node aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.prox;
        }
    }
}

