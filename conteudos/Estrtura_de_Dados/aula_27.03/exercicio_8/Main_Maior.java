import java.util.Scanner;

public class Main_Maior {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();

        System.out.print("Quantos elementos? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor: ");
            lista.insert(scanner.nextInt());
        }

        System.out.println("\nLista:");
        lista.print();

        int maior = lista.buscarMaior();

        System.out.println("Maior valor da lista: " + maior);

        scanner.close();
    }
}