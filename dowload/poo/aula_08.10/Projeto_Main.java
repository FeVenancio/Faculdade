import java.util.Scanner;
import java.util.ArrayList;
public class Projeto_Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Projeto> projetos = new ArrayList<Projeto>();
        Projeto p = null;
        Tarefa t = null;
        char escolha;
        do{
            System.out.println("[1] Cadastrar projeto");
            System.out.println("[2] Adicionar tarefa");
            System.out.println("[3] Adicionar membro a uma tarefa");
            System.out.println("[4] Lista projetos");
            System.out.println("[5] Mostrar projeto específico (ID)");
            System.out.println("[6] Sair");
            System.out.println("Escolha uma das opções a cima:");
            escolha = scn.next().charAt(0);

            switch (escolha) {
                case '1':
                    System.out.println("Digite o nome do projeto:");
                    String nome = scn.next();
                    System.out.println("Digite um ID para o projeto:");
                    String id = scn.next();
                    p = new Projeto(nome, id);
                    projetos.add(p);
                    break;
                case '2':
                    if (p == null) {
                        System.out.println("Projeto não criado!");
                    } else {
                        System.out.println("Qual o id do projeto que deseja adicionar a tarefa ?");
                        id = scn.next();
                        for (Projeto projeto : projetos) {
                            if (projeto.getId().equals(id)) {
                                System.out.println("ID encontrado!");
                                System.out.println("Qual seria a tarefa ?");
                                String tarefa = scn.next();
                                t = new Tarefa(tarefa);
                                projeto.addTarefa(t);
                                break;
                            }
                        }
                    }
                    break;
            }
        } while (escolha != '6');
    }
}
