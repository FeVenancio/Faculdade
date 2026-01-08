import java.util.Scanner;

public class CorrecaoVetores {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int qtd = 5;
        int[] valores = new int[qtd];

        for(int i = 0; i < qtd; i++) {
            System.out.println("Digite o valor da posição: " + (i + 1));
            valores[i] = scn.nextInt();
            for (int j = 0; j < i; j++) {
                if (valores[i] == valores[j]) {
                    System.out.println("O número: " + valores[i] + " já existe, digite outro número...");
                    i--;

                }
            }

        }
        System.out.println("***********************************");
        System.out.println("Digite o valor a ser buscado: ");
        int valorBusca = scn.nextInt();

        for(int i = 0; i < qtd; i++) {

            if(valorBusca == valores[i]){
                System.out.println("Ehhhhhhhh achei está na posição: " + (i + 1));
                break;
            }  
        } 
    scn.close();
    }
}