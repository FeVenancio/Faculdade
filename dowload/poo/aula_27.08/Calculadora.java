import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int x = scn.nextInt();

        System.out.println("Digite o segundo número:");
        int y = scn.nextInt();

        System.out.println("Resultado: " + soma(x,y));
        scn.close();
    }

    public static int soma(int x, int y) {
        int soma = x + y;
        return soma;
    }  
}
