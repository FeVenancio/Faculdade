package ex1;
import java.util.Scanner;

public class Navegador {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        LinkedList listaSites = new LinkedList();

        listaSites.visitar("MercadoLivre.com");
        listaSites.visitar("Shoppe.com");
        listaSites.visitar("Shein.com");
        listaSites.visitar("Amazon.com");
        listaSites.visitar("Netshoes.com");
        listaSites.visitar("Olimpikus.com");

        System.out.println(listaSites.voltar());
        System.out.println(listaSites.voltar());
        System.out.println(listaSites.avancar());


        scn.close();
    }
}