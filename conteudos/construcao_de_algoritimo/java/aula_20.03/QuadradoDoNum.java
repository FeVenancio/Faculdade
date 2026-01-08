import java.util.Scanner;

public class QuadradoDoNum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um número inteiro: ");
        num = scn.nextInt();
        
        num = num * num;
        System.out.println("O quadrado do número digitado é " + num + ".");

        scn.close();


    }
}
