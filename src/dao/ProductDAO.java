package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import jdbc.ConnectionFactory;
import model.Product;

public class ProductDAO {

    private Connection conn;

    public ProductDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }

    // metodo cadastrar produtos
    public void cadastrarProdutos(Product obj) {

        try {

            // 1� passo: cadastrar o comando SQL
            String sql = "insert into tb_produtos(name,code,quantity,price)" + "values(?,?,?,?)";

            // 2� passo: conectar com o banco de dados
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, obj.getName());
            st.setInt(2, obj.getCode());
            st.setInt(3, obj.getQuantity());
            st.setDouble(4, obj.getPrice());

            st.execute();

            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO");
            st.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR " + error);

        }
    }

    // metodo listar Produtos
    public List<Product> listarProdutos() {

        try {
            // 1� criar a lista

            List<Product> lista = new ArrayList<>();

            // criar o sql
            String sql = "select* from tb_produtos";

            // executar o comando
            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Product obj = new Product();
                obj.setID(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setCode(rs.getInt("code"));
                obj.setQuantity(rs.getInt("quantity"));
                obj.setPrice(rs.getDouble("price"));

                lista.add(obj);
            }
            return lista;
        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "erro ao listar produtos " + error);
            return null;

        }

    }

    public void atualizarEstoque(Product obj) {

        try {

            // 1� passo: cadastrar o comando SQL
            String sql = "UPDATE tb_produtos SET quantity = " + obj.getQuantity() + " WHERE code = " + obj.getCode();

            // 2� passo: conectar com o banco de dados
            PreparedStatement st = conn.prepareStatement(sql);

            int linhasAfetadas = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Estoque alterado com sucesso!");
            st.close();

        } catch (SQLException error) {
            System.out.println("ERRO AO ALTERAR!" + error);
            JOptionPane.showMessageDialog(null, "Erro ao adicionar no estoque! " + error);

        }
    }

    public void excluirProdutoEstoque(Product obj) {

        try {

            String sql = "DELETE from tb_produtos WHERE code = " + obj.getCode();

            PreparedStatement st = conn.prepareStatement(sql);

            int i = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir?",
                    "Continua",
                    JOptionPane.OK_CANCEL_OPTION
            );
            if (i == JOptionPane.YES_OPTION) {
                int linhasAfetadas = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                st.close();

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro excluir!\n" + error);
        }

    }

    public List<Product> listarProdutosPorNome(String produto) {

        try {
            // 1� criar a lista

            List<Product> lista = new ArrayList<>();

            // criar o sql
            String sql = "SELECT * FROM tb_produtos WHERE name LIKE ?";

            // executar o comando
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, produto);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Product obj = new Product();
                obj.setID(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setCode(rs.getInt("code"));
                obj.setQuantity(rs.getInt("quantity"));
                obj.setPrice(rs.getDouble("price"));

                lista.add(obj);
            }
            return lista;
        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "erro ao listar produtos " + error);
            return null;
        }
    }

}
