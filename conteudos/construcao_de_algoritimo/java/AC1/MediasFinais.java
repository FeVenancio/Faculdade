import java.util.Scanner;

public class MediasFinais {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        /*nome de variável de preferência em minúsculo pois em maiúsculo significa constancia*/

        double ac1 = 0.0;
        double ac2 = 0.0;
        double ag = 0.0;
        double af = 0.0;
        double NotaMinima = 0.0;

        System.out.println("Digite a nota mínima para aprovação: ");
        NotaMinima = scn.nextDouble();
        System.out.println("Digite suas notas");
        System.out.println("AC1: ");
        ac1 = scn.nextDouble();
        System.out.println("AC2: ");
        ac2 = scn.nextDouble();
        System.out.println("AG: ");
        ag = scn.nextDouble();
        System.out.println("AF: ");
        af = scn.nextDouble();
        System.out.println("Suas notas são as seguintes: AC1: " + ac1 + " AC2: " + ac2 + " AG: " + ag + " AF: " + af);

        double mf = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

        System.out.println("Considerando os pesos de cada prova sua média final foi de: " + mf);

        if (mf >= NotaMinima) {
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        
        scn.close();
    }
    
}


