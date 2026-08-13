package exercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String valorV = "João";

        LinkedList listaPessoa = new LinkedList();

        String nome1 = "João";
        String nome2 = "Felipe";
        String nome3 = "Thi";

        listaPessoa.add(nome1);
        listaPessoa.add(nome2);
        listaPessoa.add(nome3);

        LinkedList listaNova = listaPessoa.retornar(listaPessoa, valorV);

        listaNova.print();

        scn.close();
    }
}
