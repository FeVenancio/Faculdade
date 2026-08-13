package ex5;
import java.util.Scanner;

public class Arvore {
    Scanner scn = new Scanner(System.in);
    private Node root;

    // esse node do parametro entra como root e passa pelos nós
    private Node insert(Node node, Responsavel data) {
        
        if (node == null)
            return new Node(data);

        if (data.getCodigoResponsavel() < node.data.getCodigoResponsavel()) 
            node.left = insert(node.left, data);

        else if (data.getCodigoResponsavel() > node.data.getCodigoResponsavel())
            node.right = insert(node.right, data);

        return node;
    }

    public void insert(Responsavel data) {
        root = insert(root, data);
    }

    private void inOrder(Node node) {

        if (node == null)
            return;

        inOrder(node.left);
        System.out.println("---- " + node.data.getCodigoResponsavel() + " ----");
        System.out.println("Responsável: " + node.data.getNomeResponsavel());
        inOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private boolean find(Node node, Responsavel data) {
        
        if (node == null)
            return false;

        if (node.data.getCodigoResponsavel() == data.getCodigoResponsavel())
            return true;

        if (node.data.getCodigoResponsavel() > data.getCodigoResponsavel())
            return find(node.left, data);

        return find(node.right, data);
    }

    public boolean find(Responsavel data) {
        return find(root, data);
    }

    private Responsavel menorCodigo(Node node) {

        if (node.left == null)
            return node.data;

        return menorCodigo(node.left);
    }

    public Responsavel menorCodigo() {
        return menorCodigo(root);
    }

    private Responsavel maiorCodigo(Node node) {

        if (node.right == null)
            return node.data;

        return maiorCodigo(node.right);
    }

    public Responsavel maiorCodigo() {
        return maiorCodigo(root);
    }
}
