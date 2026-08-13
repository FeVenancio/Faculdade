package ex2;

public class Main {

    public static void main(String[] args) {

        AtendimentoHospital atendimento = new AtendimentoHospital();

        atendimento.chegada("Carlos");
        atendimento.chegada("Maria");
        atendimento.chegada("João");

        System.out.println();

        System.out.println("Senha: " + atendimento.chamarProximo().getSenha());
        System.out.println("Senha: " + atendimento.chamarProximo().getSenha());
        System.out.println("Senha: " + atendimento.chamarProximo().getSenha());

        System.out.println("Senha: " + atendimento.chamarProximo().getSenha());
    }
}
