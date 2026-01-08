import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        double raio = 0;
        double area = 0;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = scn.nextDouble();

        area = raio * raio * 3.14;

        System.out.println("A área do círculo de raio " + raio + " é " + area + ".");

        scn.close();



        



    }

}
