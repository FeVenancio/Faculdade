import java.util.Scanner;
public class Pocao_Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        Pocao pocaoAtual = null;
        String nome, tipo, alvo;
        int poder, vezes;
        char escolha;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("[1] para CRIAR poção");
            System.out.println("[2] para VER poção atual");
            System.out.println("[3] para USAR poção");
            System.out.println("[4] para DESCARTAR poção");
            System.out.println("[5] para SAIR");
            System.out.println("Escolha uma das opções abaixo: ");
            escolha = scn.next().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("[1] apenas NOME");
                    System.out.println("[2] para NOME + PODER");
                    System.out.println("[3] para NOME + PODER + TIPO");
                    System.out.println("Escolha uma das opções abaixo");
                    char opcao = scn.next().charAt(0);

                    switch (opcao) {
                        case '1':
                            pocaoAtual = new Pocao("Felipe", 30);
                            pocaoAtual.setTipo("veneno");
                            System.out.println("Configurado com sucesso!");
                            break;

                        case '2':
                            System.out.println("Digite o nome: ");
                            nome = scn.next();
                            do {
                                System.out.println("Digite o dano do poder (max 100)");
                                poder = scn.nextInt();

                                if(poder > 100) {
                                    System.out.println("ERRO, poder tem que ser menor ou igual a 100");
                                }
                            } while(poder > 100);
                            pocaoAtual = new Pocao(nome, poder);
                            pocaoAtual.setTipo("Sonífero");
                            System.out.println("Configurado com sucesso!");
                            break;

                        case '3':
                            System.out.println("Digite o nome: ");
                            nome = scn.next();
                            do {
                                System.out.println("Digite o dano do poder (max 100)");
                                poder = scn.nextInt();

                                if(poder > 100) {
                                    System.out.println("ERRO, poder tem que ser menor ou igual a 100");
                                }
                            } while(poder > 100);
                            System.out.println("Digite o tipo do poder:");
                            tipo = scn.next();
                            pocaoAtual = new Pocao(nome, poder, tipo);
                            break;
                        default:
                            System.out.println("Dígito inválido, tente novamente...");
                            break;  
                    }
                    break;

                case '2':
                    if (pocaoAtual == null) {
                        System.out.println("Poção ainda não existe");
                    } else{
                        pocaoAtual.imprimir();
                    }
                    break;
                
                case '3':
                    if (pocaoAtual == null) {
                        System.out.println("Poção ainda não existe");
                    } else {
                        System.out.println("[1] para somente usar");
                        System.out.println("[2] para usar em um alvo");
                        System.out.println("[3] para usar no alvo n vezes");
                        char valor = scn.next().charAt(0);

                        switch (valor) {
                            case '1':
                                pocaoAtual.usar();
                                break;

                            case '2':
                                System.out.println("Digite o nome do alvo da poção:");
                                alvo = scn.next();

                                pocaoAtual.usar(alvo);
                                break;
                            
                            case '3':
                                System.out.println("Digite o nome do alvo:");
                                alvo = scn.next();
                                System.out.println("Digite a quantidade de vezes:");
                                vezes = scn.nextInt();

                                pocaoAtual.usar(alvo, vezes);
                                break;

                            default:
                                System.out.println("Dígito inválido, tente novamente...");
                                break;
                        }
                    }
                    break;

                case '4':
                    pocaoAtual = null;
                    System.out.println("Poção descartada");
                    break;

                case '5':
                    System.out.println("Ok, saindo...");
                    break;

                default:
                    System.out.println("Dígito inválido, tente novamente...");
                    break;
            }
        } while(escolha != '5');
        scn.close();
    }
}