public  class Professor extends Pessoa {
    String cracha;
    char tipoVinculo;
    double salario;
    
    public Professor(String nome, String cpf, String cracha) {
        super(nome, cpf);
        this.cracha = cracha;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public char getTipoVinculo() {
        return tipoVinculo;
    }
    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String imprimir() {
        String msg = "--- PROFESSOR ---" +
                    super.imprimir() +
                    "\nCracha: " + getCracha() +
                    "\nTipo Vínculo: " + tipoVinculo +
                    "\nSalário: " + salario;
        return msg;
    }
}
