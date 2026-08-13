import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        LinkedList lista01 = new LinkedList();
        LinkedList lista02 = new LinkedList();

        lista01.add("Felipe");
        lista01.add("Rodrigues");
        lista01.add("Dudu");

        lista02.add("Thiago");
        lista02.add("Dudu");
        lista02.add("Felipe");

        System.out.println("Lista 01: ");
        lista01.print();
        System.out.println("Lista 02: ");
        lista02.print();
        
        LinkedList comparador = new LinkedList();

        comparador.listasIguais(lista01, lista02);
        scn.close();
    }
}