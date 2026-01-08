import java.util.Scanner;

public class MediaNotas {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double notas = 0.0;
        

        System.out.println("Média de 3 notas");
        System.out.println("Digite a primeira nota: ");
        notas =  scn.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notas = notas +  scn.nextDouble();
        System.out.println("Digite a terceira nota: ");
        notas = notas + scn.nextDouble();
        
        double média = notas / 3;

        System.out.println("Sua média é: " + média );

        scn.close();

       
        

        





    }


}
