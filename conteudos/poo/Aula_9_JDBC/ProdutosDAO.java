package Aula_9_JDBC.dao;

import Aula_9_JDBC.entity.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO {

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, valor, categoria, quantidade) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setString(3, produto.getCategoria());
            stmt.setInt(4, produto.getQuantidade());
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto: " + ex.getMessage());
        }
    }

    public void editar(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, valor = ?, categoria = ?, quantidade = ? WHERE id_produto = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor());
            stmt.setString(3, produto.getCategoria());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setInt(5, produto.getId_produto());
            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao editar produto: " + ex.getMessage());
        }
    }

    public void excluir(int id_produto) {
        String sql = "DELETE FROM produto WHERE id_produto = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_produto);
            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro ao excluir produto: " + ex.getMessage());
        }
    }

    public ArrayList<Produto> getAllProdutos() {
        String sql = "SELECT * FROM produto";
        ArrayList<Produto> produtos = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id_produto");
                String nome = rs.getString("nome");
                double valor = rs.getDouble("valor");
                String categoria = rs.getString("categoria");
                int quantidade = rs.getInt("quantidade");

                Produto produto = new Produto(id, nome, valor, categoria, quantidade);
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar todos os produtos: " + ex.getMessage());
        }

        return produtos;
    }

    public Produto getProdutoById(int id_produto) {
        Produto produto = null;
        String sql = "SELECT * FROM produto WHERE id_produto = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id_produto);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    produto = new Produto(
                        rs.getInt("id_produto"),
                        rs.getString("nome"),
                        rs.getDouble("valor"),
                        rs.getString("categoria"),
                        rs.getInt("quantidade")
                    );
                }
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar produto por ID: " + ex.getMessage());
        }

        return produto;
    }
}
