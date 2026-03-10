import java.util.LinkedList;
import java.util.Scanner;

public class ListaEncadeadas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // lista encadeada

        Node node = new Node();
        
        String value = scn.next();
        node.Append(value);
    
        for(Node x : node) {
            System.out.println(x);
        }
        
        scn.close();
    }
}
