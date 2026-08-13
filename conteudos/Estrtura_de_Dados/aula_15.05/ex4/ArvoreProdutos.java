package ex4;

class ArvoreProdutos {
    Node root;

    public Node inserir(Node root, int codigo, String nome) {
        if (root == null) {
            return new Node(codigo, nome);
        }

        if (codigo < root.codigo) {
            root.esquerda = inserir(root.esquerda, codigo, nome);
        } else if (codigo > root.codigo) {
            root.direita = inserir(root.direita, codigo, nome);
        }

        return root;
    }

    public String buscar(Node root, int codigo) {
        if (root == null) {
            return "Produto não encontrado";
        }

        if (codigo == root.codigo) {
            return root.nome;
        }

        if (codigo < root.codigo) {
            return buscar(root.esquerda, codigo);
        } else {
            return buscar(root.direita, codigo);
        }
    }

    public void emOrdem(Node root) {
        if (root != null) {
            emOrdem(root.esquerda);
            System.out.println("Código: " + root.codigo + " | Produto: " + root.nome);
            emOrdem(root.direita);
        }
    }

    public Node menorValor(Node root) {
        while (root.esquerda != null) {
            root = root.esquerda;
        }
        return root;
    }

    public Node remover(Node root, int codigo) {
        if (root == null) {
            return null;
        }

        if (codigo < root.codigo) {
            root.esquerda = remover(root.esquerda, codigo);

        } else if (codigo > root.codigo) {
            root.direita = remover(root.direita, codigo);

        } else {

            if (root.esquerda == null && root.direita == null) {
                return null;
            }

            if (root.esquerda == null) {
                return root.direita;
            }

            if (root.direita == null) {
                return root.esquerda;
            }

            Node menor = menorValor(root.direita);

            root.codigo = menor.codigo;
            root.nome = menor.nome;

            root.direita = remover(root.direita, menor.codigo);
        }

        return root;
    }
}
