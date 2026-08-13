public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.push("Vagão 1");
        pilha.push("Vagão 2");
        pilha.push("Vagão 3");

        System.out.println("Ordem de saída dos vagões:");

        pilha.mostrarSaida();
    }
}
