import java.util.Scanner;

public class Cores {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String cor = " ";


        System.out.println("Insira o nome de uma cor entre: azul, vermelho, verde, amarelo, rosa, preto ou branco");
        cor = scn.next().toLowerCase();

        switch(cor) {
            case "azul":
                System.out.println("Azul é a cor do mar");
                break;

            case "vermelho":
                System.out.println("Vermelho é a cor do amor");
                break;

            case "verde": 
                System.out.println("Verde é a cor da grama");
                break;

            case "amarelo":
                System.out.println("Amarelo é a cor da banana");
                break;

            case "rosa":
                System.out.println("Rosa é a cor do inter miami");
                break;

            case "preto": case "branco":
                System.out.println(cor + " é a cor do CORINTHIANS!");
                break;
                
            default:
                System.out.println("MULAAAAAAAAA... digite uma das cores válidas (azul, vermelho, verde, amarelo, rosa, preto ou branco)");
        }

        scn.close();
    }
    
}
