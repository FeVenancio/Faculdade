import java.util.Scanner;

public class Somatoria {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*Escreva um algoritmo que leia uma matriz nxm de números inteiros e exiba
        a soma de todos os elementos*/

        int qtdLinhas = 2, qtdColunas = 3;
        int[][] matriz = new int[qtdLinhas][qtdColunas];
        int somatoria = 0;

        for (int i = 0; i < qtdLinhas; i++) {
            for (int j = 0; j < qtdColunas; j++) {
                System.out.println("Digite o número de coordenada " + i + "," + j + ":");
                matriz[i][j] = scn.nextInt();
                somatoria += matriz[i][j];
                System.out.println(somatoria);
            }
        }
        scn.close();
    }
}
