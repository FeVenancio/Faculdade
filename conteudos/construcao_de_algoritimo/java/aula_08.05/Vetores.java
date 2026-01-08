import java.util.Scanner;

    public class Vetores {

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            int qtdDeProdutos = 3;

            String[] nomeDoProduto = new String[qtdDeProdutos];
            double[] estoque = new double[qtdDeProdutos];

            for(int i = 0; i < estoque.length; i++){

                System.out.println("Digite um nome de produto: ");
                nomeDoProduto[i] = scn.next();
                System.out.println("Digite a quantidade de estoque: ");
                estoque[i] = scn.nextDouble();
            }

            for(int i = 0; i < estoque.length; i++){

                System.out.println("Produto " + nomeDoProduto[i] + " possui estoque de " + estoque[i]);
            }
        
        
        
            scn.close();
        }
    }