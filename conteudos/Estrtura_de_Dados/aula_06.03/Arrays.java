import java.util.Scanner;

public class Arrays {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] array = new int[5]; // rapido facil e pratico porem nao da para aumentar o tamanho do array

        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for(int x : array) {
            System.out.println(x);
        }
        scn.close();
    }
}
