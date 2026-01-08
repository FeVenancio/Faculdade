import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /* 
        int numeroMagico = 7;
        int chute = 0;

        System.out.println("Tente adivinhar o número (apenas números positivos): ");
        chute = scn.nextInt();

        while (chute != numeroMagico) {
            System.out.println("Errado, digite outro número");
            chute = scn.nextInt();
        }

        System.out.println("Parabens era o número mágico!");

        outro exercicio

        int c = 0;

        System.out.println("Defina o início: ");
        int inicio = scn.nextInt();

        System.out.println("Defina o fim");
        int fim = scn.nextInt();

        c = inicio;
        while (c <= fim && c % 7 != 0) {
            System.out.println(c + " nao é divisível por 7");

            c++;
        }

        if (c % 7 == 0) {
            System.out.println(c + " é divisível por 7");
        }
        
         outro exercicio */

        String op = "";
        int num1, num2, result = 0;
        String decisao = "c";



        while (decisao.equals("c") || decisao.equals("s")) {


            if (decisao.equals("s")) {

                System.out.println("Ok, saindo...");
                decisao = "123456789";
            } else {

                System.out.println("Digite o primeiro número: ");
                num1 = scn.nextInt();

                System.out.println("Digite o segundo número: ");
                num2 = scn.nextInt();

                System.out.println("Digite a operação (+ ou -): ");
                op = scn.next();

                switch (op) {

                    case "+" :
                        result = num1 + num2;
                        break;

                    case "-" :
                        result = num1 - num2;
                        break;

                    default :
                        System.out.println("Digito inválido tente (+ ou -)");
                        
                }
                if (op.equals("+") || op.equals("-")) {
                System.out.println("Resultado: " + result);
                }

                System.out.println("(c) para continuar ou (s) para sair");
                decisao = scn.next().toLowerCase();            
            }
        }

        if (!decisao.equals("s") && !decisao.equals("c") && !decisao.equals("123456789")) {

            System.out.println("Digito inválido, reinicie o programa");
            
        }
        


        

        scn.close();
    }
}



