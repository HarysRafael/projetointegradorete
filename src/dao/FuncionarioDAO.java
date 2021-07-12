package dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FuncionarioModel;
import util.Conexao;
import util.Corretores;

public class FuncionarioDAO {

    private ArrayList<FuncionarioModel> lista = new ArrayList<FuncionarioModel>();
    private Connection conn;
    private Corretores corretores;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public FuncionarioDAO() {
        conn = new Conexao().getConnection();

    }

    public void cadastrarFuncionario(FuncionarioModel funcionarioModel) {

        String sql = "INSERT INTO tbl_funcionario (nome_funcionario, email_funcionario, telefone_funcionario, dataContrato_funcionario) VALUES(?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, funcionarioModel.getNome());
            stmt.setString(2, funcionarioModel.getEmail());
            stmt.setString(3, funcionarioModel.getTelefone());
            stmt.setString(4, corretores.converterParaSql(funcionarioModel.getDataContrato()));
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar funcionário: " + e);
        }
    }

    public void editarFuncionario(FuncionarioModel funcionarioModel) {

       String sql = "UPDATE tbl_funcionario SET nome_funcionario = ?, email_funcionario = ?, telefone_funcionario = ?, datacontrato_funcionario = ? WHERE id_funcionario = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, funcionarioModel.getNome());
            stmt.setString(2, funcionarioModel.getEmail());
            stmt.setString(3, funcionarioModel.getTelefone());
            stmt.setString(4, corretores.converterParaSql(funcionarioModel.getDataContrato()));
            stmt.setInt(5, funcionarioModel.getId());
            stmt.execute();
            stmt.close();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar funcionário: " + e);
        }
    }

    public void excluirFuncionario(int id) {

        String sql = "DELETE FROM tbl_funcionario WHERE id_funcionario =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao Deletar: " + e);
        }
    }

    public ArrayList<FuncionarioModel> listarTodos() {

        String sql = "SELECT * FROM tbl_funcionario";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                FuncionarioModel funcionarioModel = new FuncionarioModel();
                funcionarioModel.setId(rs.getInt("id_funcionario"));
                funcionarioModel.setNome(rs.getString("nome_funcionario"));
                funcionarioModel.setEmail(rs.getString("email_funcionario"));
                funcionarioModel.setTelefone(rs.getString("telefone_funcionario"));
                funcionarioModel.setDataContrato(corretores.converterParaJava(rs.getString("dataContrato_funcionario")));
                lista.add(funcionarioModel);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar: " + e);
        }

        return lista;
    }

    public ArrayList<FuncionarioModel> encontrarPorNome(String nome) {

        String sql = "SELECT * FROM tbl_funcionario WHERE nome_funcionario LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                FuncionarioModel funcionarioModel = new FuncionarioModel();
                funcionarioModel.setId(rs.getInt("id_funcionario"));
                funcionarioModel.setNome(rs.getString("nome_funcionario"));
                funcionarioModel.setEmail(rs.getString("email_funcionario"));
                funcionarioModel.setTelefone(rs.getString("telefone_funcionario"));
                funcionarioModel.setDataContrato(corretores.converterParaJava(rs.getString("dataContrato_funcionario")));
                lista.add(funcionarioModel);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar: " + e);
        }

        return lista;
    }

}
