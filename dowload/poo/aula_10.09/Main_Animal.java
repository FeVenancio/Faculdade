import java.util.Scanner;

public class Main_Animal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Animal animal1 = new Animal(100, 100, true);

        String nome, tipo;
        int idade;
        char escolha, opcao;
        
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Cadastrar animal");
            System.out.println("2. Alimentar o animal");
            System.out.println("3. Brincar com o animal");
            System.out.println("4. Fazer o animal dormir");
            System.out.println("5. Mostrar os status do animal");
            System.out.println("Escolha uma das opções a cima:");
            opcao = scn.next().charAt(0);

            switch (opcao) {
                case '1':
                    if (animal1.getNome() == null) {
                        System.out.println("Cadastro do animal");
                        System.out.println("Nome: ");
                        nome = scn.next();
                        animal1.setNome(nome);
                        System.out.println("Tipo: ");
                        tipo = scn.next();
                        animal1.setTipo(tipo);
                        System.out.println("Idade: ");
                        idade = scn.nextInt();
                        animal1.setIdade(idade);
                        System.out.println("Cadastro realizado com sucesso!");
                    } else {
                        System.out.println("Animal já cadastrado, deseja substitui-lo ?(sim 's' ou não 'n')");
                        escolha = scn.next().charAt(0);

                        if (escolha == 's') {
                            System.out.println("Cadastro do animal");
                            System.out.println("Nome: ");
                            nome = scn.next();
                            animal1.setNome(nome);
                            System.out.println("Tipo: ");
                            tipo = scn.next();
                            animal1.setTipo(tipo);
                            System.out.println("Idade: ");
                            idade = scn.nextInt();
                            animal1.setIdade(idade);
                            System.out.println("Cadastro realizado com sucesso!");
                        } else {
                            System.out.println("Ok, voltando para o menu principal...");
                        }
                    }
                    break;
                case '2':
                    if (animal1.getNome() == null) {
                        System.out.println("Primeiro voce precisa cadastrar um animal");
                        System.out.println("Selecione '1' na tela de MENU");
                    } else {
                        animal1.alimnetar();
                    }
                    break;
                case '3':
                    if (animal1.getNome() == null) {
                        System.out.println("Primeiro voce precisa cadastrar um animal");
                        System.out.println("Selecione '1' na tela de MENU");
                    } else {
                        animal1.brincar();
                    }
                    break;
                case '4':
                    if (animal1.getNome() == null) {
                        System.out.println("Primeiro voce precisa cadastrar um animal");
                        System.out.println("Selecione '1' na tela de MENU");
                    } else {
                        animal1.dormir();
                    }
                    break;
                case '5':
                    if (animal1.getNome() == null) {
                        System.out.println("Primeiro voce precisa cadastrar um animal");
                        System.out.println("Selecione '1' na tela de MENU");
                    } else {
                        System.out.println(animal1.mostrarStatus());
                    }
                    break;
                    default:
                        System.out.println("Opção inválida, tente novamente...");
            }

        } while (animal1.checkVivo() == true);
        System.out.println("Seu animal morreu");
        System.out.println("Fechando programa...");

        scn.close();
    }
}
