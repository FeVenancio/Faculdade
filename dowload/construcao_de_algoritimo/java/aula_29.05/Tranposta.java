import java.util.Scanner;

    public class Tranposta {

        public static void main (String[] args) {
            Scanner scn = new Scanner(System.in);

            int linhas = 3, colunas = 2;
            int[][] matriz = new int[linhas][colunas];
            int[][] transposta = new int[colunas][linhas];

            for (int i = 0; i < linhas; i++){
                for(int j = 0; j < colunas; j++){
                    System.out.println("Digite o elemento: " + i + "," + j);
                    matriz[i][j] = scn.nextInt();
                }
            }

            System.out.println("**************");
            System.out.println("******Original*********");

            for (int i = 0; i < linhas; i++){
                for(int j = 0; j < colunas; j++){
                    System.out.print(matriz[i][j] + "|");
                }
                System.out.println("");
            } 

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    transposta[j][i] = matriz[i][j];
                }
            }

            System.out.println("****Transposta****");
            System.out.println("");

            for (int i = 0; i < colunas; i++) {
                for (int j = 0; j < linhas; j++) {
                    System.out.print(transposta[i][j] + "|");

                }
                System.out.println("");
            }
        scn.close();
        }
    }