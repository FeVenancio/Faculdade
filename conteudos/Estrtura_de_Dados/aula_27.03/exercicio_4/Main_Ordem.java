import java.util.Scanner;

public class Main_Ordem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();

        System.out.print("Quantos elementos? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor: ");
            lista.insert(scanner.nextInt());
        }

        lista.print();

        if (lista.estaOrdenada()) {
            System.out.println("Lista ordenada!");
        } else {
            System.out.println("Lista não ordenada!");
        }

        scanner.close();
    }
}
