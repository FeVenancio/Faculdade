import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        double fahrenheit = 0.0;
        System.out.println("Qual a temperatura em graus Celsius ?");
        double temperatura = scn.nextDouble();

        System.out.println("A temperatura em fahrenheit é " + fahrenheit(temperatura, fahrenheit));
        scn.close();
    }

    public static double fahrenheit(double temperatura, double fahrenheit){
        fahrenheit = temperatura * 1.8 + 32;
        return fahrenheit;
    }
}
