import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int result = 1;
        int multi = 0;

        System.out.println("Digite um número: ");
        int num = scn.nextInt();

        for(int valor = num; valor >= 1; valor--){
            multi = result;
            result = result * valor;
            if (multi == 1) {

            } else {
            System.out.println(multi + " * " + valor + " = " + result );
            }
        }



        scn.close();
    }
}

