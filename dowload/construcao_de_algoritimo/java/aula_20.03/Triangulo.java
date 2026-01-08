import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        double area = 0;

        System.out.println("Qual o tamanho da base do triangulo: ");
        base = scn.nextDouble();
        System.out.println("Qual o tamanho da altura do triangulo: ");
        altura = scn.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A area do triangulo com base " + base + " e altura " + altura + " é " + area + ".");

        scn.close();
        


    }
}
