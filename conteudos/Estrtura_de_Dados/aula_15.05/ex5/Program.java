package ex5;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        Arvore arvore = new Arvore();
        Responsavel rsp1 = new Responsavel(1, "Felipe", "(11) 99944-2420", "Felipinho");
        Responsavel rsp2 = new Responsavel(2, "Joao", "(15) 99870-4532", "Joaozinho");
        Responsavel rsp3 = new Responsavel(3, "Eduardo", "(15) 99956-4032", "Dxduzinnn");
        Responsavel rsp4 = new Responsavel(4, "Guilherme", "(15) 96502-2166", "Rodriguinho");

        arvore.insert(rsp1);
        arvore.insert(rsp2);
        arvore.insert(rsp3);
        arvore.insert(rsp4);

    System.out.println("Em ordem:");
    arvore.inOrder();

    System.out.println("\nMenor código:");
    System.out.println(arvore.menorCodigo().getCodigoResponsavel());

    System.out.println("\nMaior código:");
    System.out.println(arvore.maiorCodigo().getCodigoResponsavel());



        scn.close();
    }
}
