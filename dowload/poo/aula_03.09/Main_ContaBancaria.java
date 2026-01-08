public class Main_ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.depositar(100);
        c1.imprimir();
        c1.sacar(50);
        c1.imprimir();
        c1.sacar(51);
    }
}
