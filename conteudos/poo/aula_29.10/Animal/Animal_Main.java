import java.util.ArrayList;
import java.util.Scanner;

public class Animal_Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        /*Cachorro c1 = new Cachorro("felipe", 19, 100);
        Gato g1 = new Gato("Lucas", 23, 45);
        Capivara cap1 = new Capivara("Joao", 20, 160);

        animais.add(cap1);
        animais.add(c1);
        animais.add(g1);

        for (Animal a : animais) {
            System.out.println(a.imprimir());
        }*/
        char escolha, escolhaAnimal;
        String nome;
        int idade, velocidade, peso, alturaSalto;
        Cachorro c;
        Capivara cap;
        Gato g;
        do{
            System.out.println("--- MENU ---");
            System.out.println("[1] Cadastrar animal");
            System.out.println("[2] Mostrar todos os animais cadastrados");
            System.out.println("[3] animais falando");
            System.out.println("[4] sair");
            System.out.println("Escolha uma das opções acima:");
            escolha = scn.next().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("--- Cadastro ---");
                    System.out.println("Qual animal deseja cadastrar ?");
                    System.out.println("[1] Cachorro");
                    System.out.println("[2] Capivara");
                    System.out.println("[3] Gato");
                    System.out.println("Escolha uma das opções acima: ");
                    escolhaAnimal = scn.next().charAt(0);
                    switch (escolhaAnimal) {
                        case '1':
                            System.out.println("--- Cachorro ---");
                            System.out.println("Qual o nome do cachorro ?");
                            nome = scn.next();
                            System.out.println("Qual a idade do cachorro ?");
                            idade = scn.nextInt();
                            System.out.println("Qual a velocidade do cachorro ?");
                            velocidade = scn.nextInt();
                            c = new Cachorro(nome, idade, velocidade);
                            animais.add(c);
                            break;
                        case '2':
                            System.out.println("--- Capivara ---");
                            System.out.println("Qual o nome da capivara ?");
                            nome = scn.next();
                            System.out.println("Qual a idade da capivara ?");
                            idade = scn.nextInt();
                            System.out.println("Qual o peso da capivara ?");
                            peso = scn.nextInt();
                            cap = new Capivara(nome, idade, peso);
                            animais.add(cap);
                            break;
                        case '3':
                        System.out.println("--- Gato ---");
                            System.out.println("Qual o nome do gato ?");
                            nome = scn.next();
                            System.out.println("Qual a idade do gato ?");
                            idade = scn.nextInt();
                            System.out.println("Qual a altura do salto do gato ?");
                            alturaSalto = scn.nextInt();
                            g = new Gato(nome, idade, alturaSalto);
                            animais.add(g);
                            break;
                        default:
                            System.out.println("--- Erro ---");
                            System.out.println("Tente novamente...");
                            System.out.println("Digite algo válido [1, 2 ou 3]");
                            break;
                    }
                    break;
                case '2':
                    if (animais.isEmpty()) {
                        System.out.println("--- Erro ---");
                        System.out.println("Não há animais cadastrados...");
                    } else {
                        System.out.println("--- Todos os animais ---");
                        for(Animal a : animais) {
                            System.out.println(a.imprimir());
                        }
                    }
                    break;
                case '3':
                    System.out.println("--- Animais Falando ---");
                    if (animais.isEmpty()) {
                        System.out.println("--- Erro ---");
                        System.out.println("Não há animais cadastrados...");
                    } else {
                        for(Animal a : animais) {
                            System.out.println(a.falar());
                        }
                    }
                    break;
                case '4':
                    System.out.println("--- Sair ---");
                    System.out.println("Saindooo...");
                    break;
                default:
                    System.out.println("--- Erro ---");
                    System.out.println("Tente novamente...");
                    System.out.println("digite algo válido [1, 2, 3 ou 4]");
                    break;
            }
        }while(escolha != '4');
        scn.close();
    }
}
