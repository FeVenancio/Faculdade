import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int primeiro = 0, segundo = 1;

        System.out.println("Digie um número: ");
        int numTotal = scn.nextInt();

        if (numTotal == 1) {
            System.out.println("A sequencia de apenas um número na sequencia de fibonacci é: ");
            System.out.println(primeiro);
        } else {
            System.out.println("As sequencias dos " + numTotal + " primeiros números da sequencia de fibonacci ficam assim: ");
            for (int i = 0; i < numTotal; i++) {
                System.out.println(primeiro);

                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }
        

        

        scn.close();
    }
}
