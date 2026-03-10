import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int fatorial = scn.nextInt();

        int somatoria = fatorial;
        for(int i = 0; i <= fatorial; i++) {
            somatoria *= (fatorial - 1);
            fatorial = fatorial - 1;
        }
        System.out.println(somatoria);

        scn.close();
    }
}