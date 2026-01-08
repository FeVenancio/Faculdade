import java.util.Scanner;

public class Media1Variavel {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        double media = 0.0;

        System.out.println("Digite um valor: ");
        media = scn.nextDouble();
        System.out.println("Digite o segundo valor: ");
        media = media + scn.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        media = media + scn.nextDouble();

        media = media / 3;

        System.out.println("Sua média é " + media);

        scn.close();

    }


}
