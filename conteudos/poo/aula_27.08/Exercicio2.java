import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        boolean bool = false;
        System.out.println("Digite um número inteiro: ");
        int num = scn.nextInt();

        System.out.println(verificação(num, bool));
        scn.close();
    }

    public static boolean verificação(int num, boolean bool) {

        if (num % 2 == 0) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
