import java.util.Scanner;

public class Conversao {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String conversao = " ";
        int valor = 0;

        System.out.println("1000 km conversão para km 'k', metros 'm' e centimetros 'c'");
        System.out.println("Digite uma das conversões: ");
        conversao = scn.next();

        switch(conversao) {

            case "k": 
                System.out.println("1000 km");
                break;

            case "m":   
               valor = 1000 * 1000;
                System.out.println(valor + " metros"); 
                break;
            
            case "c":
                valor = 1000 * 100000;
                System.out.println(valor + " centímetros");
                break;

            default:
                System.out.println("ERRRRRROOOOOOOO... digite uma das operações válidas (k , m ou c)");
        }


        scn.close();
    }
    
}
