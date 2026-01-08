import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int qtdProdutos = 2;
        int dados = 2;
        double[][] estoque = new double[qtdProdutos][dados];
        String[] nomesProdutos = new String[qtdProdutos];

        for(int i = 0; i < qtdProdutos; i++) {
            System.out.println("Digite o nome do produto: ");
            nomesProdutos[i] = scn.next();

            System.out.println("Digite a quantidade de estoque: ");
            estoque [i][0] = scn.nextDouble();

            System.out.println("Digite o preço: ");
            estoque [i][1] = scn.nextDouble();
        }


        for(int i = 0; i < qtdProdutos; i++) {
            System.out.println("------ " + nomesProdutos[i]);
            System.out.println("------ Estoque ------ Preço");

            for(int j = 0; j < dados; j++) {
                System.out.print("------ " + estoque[i][j]);
            }
            System.out.println("");
        }
        scn.close();
    }
}
