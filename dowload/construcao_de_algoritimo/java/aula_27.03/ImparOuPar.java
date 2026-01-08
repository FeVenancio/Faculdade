import java.util.Scanner;

public class ImparOuPar{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num = 0;
        int resto = 0;

        System.out.println("Digite um número: ");
        num = scn.nextInt();

        resto = num % 2;

        if (resto == 0) {
            System.out.println("Seu número é par!");

            if (num >= 10 && num <= 50) {
                System.out.println("Está dentro do range");

            }else{
                System.out.println("Está fora do range");
            }

        }else{
            System.out.println("Seu número é impar!");

            if (num >= 11 && num <= 51) {
                System.out.println("Está dentro do range");

            }else{
                System.out.println("Está fora do range");
            }
        }

        scn.close();
    }


}
