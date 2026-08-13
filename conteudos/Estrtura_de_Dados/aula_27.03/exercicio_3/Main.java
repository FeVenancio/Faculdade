public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        Lista pares = lista.pares();

        System.out.print("pares: ");
        pares.print();
    }
}
