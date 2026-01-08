import java.util.Scanner;

public class SomaDosPares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int result = 0;

        System.out.println("Digite um número limite: ");
        int num = scn.nextInt();

        for(int valor = 2; valor <= num; valor += 2){
            
            int soma = result;
            result += valor;
             
            System.out.println(soma + " + " + valor + " = " + result);  
        }
    
        scn.close();
    }
}
