import java.util.Scanner;

public class Desafio2 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int fatorial = scn.nextInt();
        Fatorial fat = new Fatorial();
        
        int result = fat.fatorial(fatorial);
        System.out.println(result);
        scn.close();
    }
}


