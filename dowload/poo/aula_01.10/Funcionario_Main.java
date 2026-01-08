import java.util.ArrayList;
import java.util.Scanner;
public class Funcionario_Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        char escolha;
        String nome, funcao, setor;
        int codigo;
        double salario;
        do {
            System.out.println("------ MENU ------");
            System.out.println("[1] Cadastrar funcionário");
            System.out.println("[2] Mostrar todos os funcionários");
            System.out.println("[3] Mostrar funcionário");
            System.out.println("[4] sair");
            System.out.println("Escolha uma das opções a cima: ");
            escolha = scn.next().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Nome do funcionário: ");
                    nome = scn.next();
                    System.out.println("Código do funcionário: ");
                    codigo = scn.nextInt();
                    System.out.println("Setor do funcionário:");
                    setor = scn.next();
                    System.out.println("Função do funcionário: ");
                    funcao = scn.next();
                    System.out.println("Digite o salário do funcionário: ");
                    salario = scn.nextDouble();

                    Funcionario f = new Funcionario(codigo, nome, setor, funcao, salario);
                    funcionarios.add(f);
                    System.out.println("Funcionário cadastrado!");
                    break;
                case '2':
                    if (funcionarios.isEmpty() == true) {
                        System.out.println("Ainda não há funcionários registrados.");
                    } else {
                        for (Funcionario func : funcionarios) {
                            func.imprimir();
                        }
                    }
                    break;
                case '3':
                    System.out.println("Qual o código do funcionário ?");
                    int codBusca = scn.nextInt();
                    boolean encontrado = false;

                    for (Funcionario func : funcionarios) {
                        if (func.getCodigo() == codBusca) {
                            func.imprimir();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                case '4':
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Digito inválido!");
                    System.out.println("Tente novamente");
            }
        }while(escolha != '4');
        scn.close();
    }
}
