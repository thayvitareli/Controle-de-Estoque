/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Employees;

/**
 *
 * @author Thain
 */
public class EmployeeDAO {

    private Connection conn;

    public EmployeeDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }

    // metodo cadastrar produtos
    public void cadastrarFuncionarios(Employees obj) {

        try {

            // 1º passo: cadastrar o comando SQL
            String sql = "INSERT INTO funcionarios(nome,cpf,celular,email,senha,tipoAcesso)" + "VALUES(?,?,?,?,?,?)";

            // 2º passo: conectar com o banco de dados
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, obj.getName());
            st.setString(2, obj.getCpf());
            st.setString(3, obj.getCelular());
            st.setString(4, obj.getEmail());
            st.setString(5, obj.getPassword());
            st.setString(6, obj.getTipoAcesso());

            st.execute();

            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO");
            st.close();

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR " + error);

        }
    }

    // metodo listar Produtos
    public List<Employees> listarFuncionarios() {

        try {
            // 1º criar a lista

            List<Employees> lista = new ArrayList<>();

            // criar o sql
            String sql = "select* FROM funcionarios";

            // executar o comando
            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Employees obj = new Employees();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCelular(rs.getString("celular"));
                obj.setEmail(rs.getString("email"));
                obj.setPassword(rs.getString("senha"));
                obj.setTipoAcesso(rs.getString("tipoAcesso"));

                lista.add(obj);
            }
            return lista;
        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "erro ao listar funcionários " + error);
            return null;

        }

    }

    public void atualizarCadastro(Employees obj) {

        try {

            // 1º passo: cadastrar o comando SQL
            String sql = "UPDATE funcionarios SET celular = " + obj.getCelular() + " WHERE code = " + obj.getId();

            // 2º passo: conectar com o banco de dados
            PreparedStatement st = conn.prepareStatement(sql);

            int linhasAfetadas = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            st.close();

        } catch (SQLException error) {
            System.out.println("ERRO AO ALTERAR!" + error);
            JOptionPane.showMessageDialog(null, "Erro ao salvar alteração! " + error);

        }
    }

    public void excluirCadastro(Employees obj) {

        try {

            String sql = "DELETE from produtos WHERE id ?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, obj.getId());
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

    public List<Employees> buscaFuncionariosPorNome(String nome) {

        try {
            // 1º criar a lista

            List<Employees> lista = new ArrayList<>();

            // criar o sql
            String sql = "select * FROM funcionarios WHERE nome LIKE ?";

            // executar o comando
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nome);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                Employees obj = new Employees();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCelular(rs.getString("celular"));
                obj.setEmail(rs.getString("email"));
                obj.setPassword(rs.getString("senha"));
                obj.setTipoAcesso(rs.getString("tipoAcesso"));

                lista.add(obj);
            }
            return lista;
        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, "erro ao listar funcionários " + error);
            return null;

        }

    }

}
