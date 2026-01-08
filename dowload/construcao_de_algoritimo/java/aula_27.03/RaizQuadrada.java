import java.io.IOException;
import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        
        double delta = (b * b) - (4 * a * c);
        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        if (a == 0 && delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n" , x1);
            System.out.printf("R2 = %.5f%n" , x2);
        }
        scn.close();
 
    }
 
}
