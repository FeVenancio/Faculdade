class ContaBancaria {
    private String id;
    private double saldo;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }
    public void imprimir() {
        System.out.println(saldo);
    }
}
