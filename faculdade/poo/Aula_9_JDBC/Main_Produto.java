package Aula_9_JDBC.view.main;

import Aula_9_JDBC.dao.ProdutosDAO;
import Aula_9_JDBC.entity.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_Produto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutosDAO dao = new ProdutosDAO();
        int opcao = 0;

        do {
            System.out.println("\n===== MENU PRODUTOS =====");
            System.out.println("1 - Inserir Produto");
            System.out.println("2 - Apagar Produto");
            System.out.println("3 - Editar Produto");
            System.out.println("4 - Listar Todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Inserir Produto ---");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine(); // consumir quebra de linha

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    Produto novo = new Produto(nome, valor, categoria, quantidade);
                    dao.inserir(novo);
                    System.out.println("✅ Produto inserido com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Apagar Produto ---");
                    System.out.print("Informe o ID do produto: ");
                    int idExcluir = sc.nextInt();

                    dao.excluir(idExcluir);
                    System.out.println("🗑️ Produto excluído (se existia no banco).");
                    break;

                case 3:
                    System.out.println("\n--- Editar Produto ---");
                    System.out.print("Informe o ID do produto: ");
                    int idEditar = sc.nextInt();
                    sc.nextLine(); // consumir quebra de linha

                    Produto produtoExistente = dao.getProdutoById(idEditar);

                    if (produtoExistente != null) {
                        System.out.println("Produto atual: " + produtoExistente);

                        System.out.print("Novo nome (" + produtoExistente.getNome() + "): ");
                        String novoNome = sc.nextLine();
                        if (novoNome.isEmpty()) novoNome = produtoExistente.getNome();

                        System.out.print("Novo valor (" + produtoExistente.getValor() + "): ");
                        String novoValorStr = sc.nextLine();
                        double novoValor = novoValorStr.isEmpty() ? produtoExistente.getValor() : Double.parseDouble(novoValorStr);

                        System.out.print("Nova categoria (" + produtoExistente.getCategoria() + "): ");
                        String novaCategoria = sc.nextLine();
                        if (novaCategoria.isEmpty()) novaCategoria = produtoExistente.getCategoria();

                        System.out.print("Nova quantidade (" + produtoExistente.getQuantidade() + "): ");
                        String novaQtdStr = sc.nextLine();
                        int novaQtd = novaQtdStr.isEmpty() ? produtoExistente.getQuantidade() : Integer.parseInt(novaQtdStr);

                        Produto atualizado = new Produto(idEditar, novoNome, novoValor, novaCategoria, novaQtd);
                        dao.editar(atualizado);
                        System.out.println("✏️ Produto atualizado com sucesso!");
                    } else {
                        System.out.println("⚠️ Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Produtos ---");
                    ArrayList<Produto> produtos = dao.getAllProdutos();

                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto p : produtos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
