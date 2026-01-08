import java.util.Scanner;

public class MaquinaBebida {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Tabela dos refrigerantes: coca-cola = 1 pepsi = 2 fanta = 3");
        System.out.println("Digite uma opção: ");
        opcao = scn.nextInt();
        
        switch (opcao) {
            case 1: System.out.println("Coca-cola");
            break;
            case 2: System.out.println("Pepsi");
            break;
            case 3: System.out.println("Fanta");
            break;
            default: System.out.println("Opção inválida");
        }
        
        
        String op = " ";
        int a = 0, b = 0;
        double result = 0;

        System.out.println("Digite um número: ");
        a = scn.nextInt();
        System.out.println("Digite outro número: ");
        b = scn.nextInt();
        System.out.println("Agora digite a operação que deseja fazer: ");
        op = scn.next();

        switch (op){
            case "+":
                result = a + b;
                break;
            case "/":
                if( b != 0){
                result = (double) a / b;
                }else{
                    System.out.println("Números não podem ser divisíveis por 0");
                }
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default: System.out.println("Digite uma das operações válidas: + - * /");
        }

        System.out.println("O valor da operação é: " + result);


        scn.close();
        
    }
}
