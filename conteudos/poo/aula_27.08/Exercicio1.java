import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double result = 0.0;

        System.out.println("Digite o primeiro número:");
        int num1 = scn.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scn.nextInt();

        System.out.println("Digite um operador '+' '-' '*' '/':");
        String operador = scn.next();

        System.out.println("O resultado é: " + calculadora(num1, num2, operador, result));



        scn.close();
    }

    public static double calculadora(int num1, int num2, String operador, double result) {

        switch (operador) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        
            default:
                System.out.println("Digito inválido.");
                break;
        }

        return result;
    }
}
