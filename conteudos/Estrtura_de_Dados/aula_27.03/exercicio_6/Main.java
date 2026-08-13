import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite uma palavra e vou analisar para ver se é um palíndromo:");
        String palavra = scn.next();

        Stack stack = new Stack();

        for(int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            stack.push(letra);
        }

        boolean retorno = stack.palindromo(palavra);

        if (retorno) {
            System.out.println("A palavra É um palíndromo");
        } else {
            System.out.println("A palavra NÃO é um palíndromo");
        }
        scn.close();
    }
}
