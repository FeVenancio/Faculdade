import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        QueueLinkedList lista = new QueueLinkedList();

        Filme filme = new Filme("Meu Malvado Favorito", 120, 80.00);
        Filme filme2 = new Filme("Meu malvado favorito 2", 143, 110.00);
        Filme filme3 = new Filme("As branquelas", 130, 65.00);

        lista.enqueue(filme);
        lista.enqueue(filme2);
        lista.enqueue(filme3);

        lista.dequeue();

        lista.print();
        // inserção - Queue
        // remoção - deQueue
        // isEmpty
        // isFull
        // size
        // front
        // tail - rabo 
        // geralmente front e tail = -1 pois não existe essa posição dentro de um array
        // abstração de dados
        

        scn.close();
    }
}