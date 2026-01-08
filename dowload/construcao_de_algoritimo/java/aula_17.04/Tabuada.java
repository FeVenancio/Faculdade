import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um valor para a tabuada: ");
        int valor = scn.nextInt();

        for(int tab = 1; tab <= 10; tab++){
            int result = tab * valor;
            
            System.out.println(valor + " x " + tab + " = " + result );
        }
    
        scn.close();
    }
}
