import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = 0;
        System.out.println("Digite uma frase: ");
        String frase = scn.next();

        System.out.println("Digite uma letra para saber quantas vezes ela aparece na frase: ");
        char parametro = scn.next().charAt(0);

        System.out.println("Sua frase tem um total de " + contador(frase, parametro, total) + " " + parametro + "!");

        scn.close();
    }
    public static int contador(String frase, char parametro, int total) {

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == parametro) {
                total++;
            }
        }
        return total;
    }

}
