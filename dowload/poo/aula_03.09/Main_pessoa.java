import java.util.Scanner;

public class Main_pessoa {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        char opcao;

        do{
            System.out.println("____ MENU CADASTRO ____");
            System.out.println("0: CRIAR UMA PESSOA");
            System.out.println("1: MOSTRAR PESSOA");
            System.out.println("2: SAIR");
            System.out.println("Escolha uma das opções a baixo:");
            opcao = scn.next().charAt(0);

            switch (opcao) {
                case '0':
                    System.out.println("\nDigite o nome da pessoa:");
                    String nome = scn.next();
                    p1.setNome(nome);

                    System.out.println("Digite o CPF da pessoa:");
                    String cpf = scn.next();
                    p1.setCpf(cpf);

                    System.out.println("Digite o sexo da pessoa (masculino 'm' , feminino 'f' ou outro 'o')");
                    char sexo = scn.next().charAt(0);
                    p1.setSexo(sexo);

                    System.out.println("Digite a idade da pessoa:");
                    int idade = scn.nextInt();
                    p1.setIdade(idade);
                    break;

                case '1':
                    if (p1.getNome() == null) {
                        System.out.println("\nNenhuma pessoa cadastrada");
                        System.out.println("Digite '0' na tela de cadastro para criar uma pessoa.\n");
                    } else {
                        System.out.println("Dados da pessoa cadastrada:\n" + p1.imprimir() + "\n");
                        
                    }
                    break;

                case '2':
                    System.out.println("\nOk saindo...");
            
                default:
                    System.out.println("Dígito inválido, tente novamente.\n");
                    break;
            }
        } while (opcao != '2');
    
        scn.close();
    }
}
