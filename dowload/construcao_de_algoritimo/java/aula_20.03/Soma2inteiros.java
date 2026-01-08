import java.util.Scanner;

public class Soma2inteiros {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int valor1 = 0;
    int valor2 = 0;
    int resultado = 0;
    
    System.out.println("Soma dois numeros inteiros");
    System.out.println("Digite o primeiro número: ");
    valor1 = scn.nextInt();
    System.out.println("Digite o segundo número: ");
    valor2 = scn.nextInt();
    resultado = valor1 + valor2;
    System.out.println("A soma é: " + resultado);
    /*  
     * char = '0'; apenas um caracter
     * String = "0"; palavras ou frases
     * float = ocupa metade do espaço da mémoria do que o double
     * double = ocupa o dobro da mémoria porem é o melhor a se usar(float as vezes da erro)
     * boolean = true ou false;
     */
    scn.close();

    

  }


}