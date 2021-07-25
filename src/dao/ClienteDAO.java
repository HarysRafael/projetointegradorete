package dao;

import java.sql.Connection;
import model.ClienteModel;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Corretores;

public class ClienteDAO {

    private ArrayList<ClienteModel> lista = new ArrayList<ClienteModel>();
    private Connection conn;
    private Corretores corretores;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public ClienteDAO() {
        conn = new Conexao().getConnection();
    }

    public void cadastrarCliente(ClienteModel clienteModel) {

        String sql = "INSERT INTO tbl_cliente (nome_cliente, email_cliente, telefone_cliente, datacadastro_cliente, rua_cliente, bairro_cliente, cidade_cliente) VALUES (?,?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clienteModel.getNome());
            stmt.setString(2, clienteModel.getEmail());
            stmt.setString(3, clienteModel.getTelefone());
            stmt.setString(4, corretores.converterParaSql(clienteModel.getDataCadastro()));
            stmt.setString(5, clienteModel.getRua());
            stmt.setString(6, clienteModel.getBairro());
            stmt.setString(7, clienteModel.getCidade());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar Cliente: " + e);
        }

    }

    public void editarCliente(ClienteModel clienteModel) {
        String sql = "UPDATE tbl_cliente SET nome_cliente = ?, email_cliente = ?, telefone_cliente = ?, datacadastro_cliente = ?, rua_cliente = ?, bairro_cliente = ?, cidade_cliente = ? WHERE id_cliente = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clienteModel.getNome());
            stmt.setString(2, clienteModel.getEmail());
            stmt.setString(3, clienteModel.getTelefone());
            stmt.setString(4, corretores.converterParaSql(clienteModel.getDataCadastro()));
            stmt.setString(5, clienteModel.getRua());
            stmt.setString(6, clienteModel.getBairro());
            stmt.setString(7, clienteModel.getCidade());
            stmt.setInt(8, clienteModel.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao editar cliente: " + e);
        }

    }

    public void excluirCliente(int id) {
        String sql = "DELETE FROM tbl_cliente WHERE id_cliente =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar cliente: " + e);
        }

    }

    public ArrayList<ClienteModel> listarTodos() {

        String sql = "SELECT * FROM tbl_cliente";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClienteModel clienteModel = new ClienteModel();
                clienteModel.setId(rs.getInt("id_cliente"));
                clienteModel.setNome(rs.getString("nome_cliente"));
                clienteModel.setEmail(rs.getString("email_cliente"));
                clienteModel.setTelefone(rs.getString("telefone_cliente"));
                clienteModel.setRua(rs.getString("rua_cliente"));
                clienteModel.setBairro(rs.getString("bairro_cliente"));
                clienteModel.setCidade(rs.getString("cidade_cliente"));
                clienteModel.setDataCadastro(corretores.converterParaJava(rs.getString("dataCadastro_cliente")));
                lista.add(clienteModel);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar clientes: " + e);
        }

        return lista;
    }

    public ArrayList<ClienteModel> listarPorNome(String nome) {

        String sql = "SELECT * FROM tbl_cliente WHERE nome_cliente LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClienteModel clienteModel = new ClienteModel();
                clienteModel.setId(rs.getInt("id_cliente"));
                clienteModel.setNome(rs.getString("nome_cliente"));
                clienteModel.setEmail(rs.getString("email_cliente"));
                clienteModel.setTelefone(rs.getString("telefone_cliente"));
                clienteModel.setRua(rs.getString("rua_cliente"));
                clienteModel.setBairro(rs.getString("bairro_cliente"));
                clienteModel.setCidade(rs.getString("cidade_cliente"));
                clienteModel.setDataCadastro(corretores.converterParaJava(rs.getString("dataCadastro_cliente")));
                lista.add(clienteModel);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar cliente: " + e);
        }

        return lista;
    }
    
    public ClienteModel buscarUnicoClientePorNome(String nome){
            ClienteModel clienteModel = new ClienteModel();
            String sql = "SELECT * FROM tbl_cliente WHERE nome_cliente LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                clienteModel.setId(rs.getInt("id_cliente"));
                clienteModel.setNome(rs.getString("nome_cliente"));
                clienteModel.setEmail(rs.getString("email_cliente"));
                clienteModel.setTelefone(rs.getString("telefone_cliente"));
                clienteModel.setRua(rs.getString("rua_cliente"));
                clienteModel.setBairro(rs.getString("bairro_cliente"));
                clienteModel.setCidade(rs.getString("cidade_cliente"));
                clienteModel.setDataCadastro(corretores.converterParaJava(rs.getString("dataCadastro_cliente")));
                return clienteModel;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar cliente: " + e);
        }

        return clienteModel;
    }
    
    

}
