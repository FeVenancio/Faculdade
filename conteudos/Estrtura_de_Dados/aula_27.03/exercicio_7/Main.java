import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scn.nextInt();

        Stack stack = new Stack();

        stack.push(num);
        System.out.println("Print:");
        stack.printInverso();

        scn.close();
    }
}