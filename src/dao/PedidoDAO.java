package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;
import model.PedidoModel;
import util.Conexao;
import util.Corretores;

public class PedidoDAO {

    private Connection conn;
    private Corretores corretores;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private PedidoModel pedidoModel = new PedidoModel();        
    private ArrayList<PedidoModel> lista = new ArrayList<PedidoModel>();

    public PedidoDAO() {
        conn = Conexao.getConnection();
    }

    public void cadastrarPedido(PedidoModel pedidoModel) {
        ClienteModel clienteModel = new ClienteDAO().buscarUnicoClientePorNome(pedidoModel.getNomeCliente());

        String sql = "INSERT INTO tbl_pedido (data_pedido, total_pedido, nome_cliente_pedido, bairro_cliente_pedido, id_cliente_pedido, dataCadastro_cliente_pedido ) VALUES (?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, corretores.converterParaSql(pedidoModel.getData()));
            stmt.setString(2, pedidoModel.getTotal());
            stmt.setString(3, pedidoModel.getNomeCliente());
            stmt.setString(4,clienteModel.getBairro());
            stmt.setInt(5, clienteModel.getId());
            stmt.setString(6, corretores.converterParaSql(clienteModel.getDataCadastro()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar item: " + e);
        }
    }
    
    public ArrayList<PedidoModel> buscarPedidoPorNomeCliente(String nome){
            
            
            String sql = "SELECT * FROM tbl_pedido WHERE nome_cliente_pedido LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                PedidoModel pedidoModel = new PedidoModel();
                pedidoModel.setId(rs.getInt("id_pedido"));
                pedidoModel.setData(rs.getString("data_pedido"));
                pedidoModel.setNomeCliente(rs.getString("nome_cliente_pedido"));
                pedidoModel.setTotal(rs.getString("total_pedido"));
                pedidoModel.setBairroCliente(rs.getString("bairro_cliente_pedido"));
                pedidoModel.setIdCliente(rs.getInt("id_cliente_pedido"));
                pedidoModel.setDataCadCliente(corretores.converterParaJava(rs.getString("dataCadastro_cliente_pedido")));
                lista.add(pedidoModel);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar pedido: " + e);
        }

        return lista;
    }

    public ArrayList<PedidoModel> buscarPedidoPorBairroCliente(String bairro){
            
            String sql = "SELECT * FROM tbl_pedido WHERE bairro_cliente_pedido LIKE '%" + bairro + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                PedidoModel pedidoModel = new PedidoModel();
                pedidoModel.setId(rs.getInt("id_pedido"));
                pedidoModel.setData(rs.getString("data_pedido"));
                pedidoModel.setNomeCliente(rs.getString("nome_cliente_pedido"));
                pedidoModel.setTotal(rs.getString("total_pedido"));
                pedidoModel.setBairroCliente(rs.getString("bairro_cliente_pedido"));
                pedidoModel.setIdCliente(rs.getInt("id_cliente_pedido"));
                pedidoModel.setDataCadCliente(corretores.converterParaJava(rs.getString("dataCadastro_cliente_pedido")));
                lista.add(pedidoModel);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar pedido: " + e);
        }

        return lista;
    }
    
    public ArrayList<PedidoModel> listarTodos() {
        
        String sql = "SELECT * FROM tbl_pedido";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                PedidoModel pedidoModel = new PedidoModel();
                pedidoModel.setId(rs.getInt("id_pedido"));
                pedidoModel.setData(rs.getString("data_pedido"));
                pedidoModel.setNomeCliente(rs.getString("nome_cliente_pedido"));
                pedidoModel.setTotal(rs.getString("total_pedido"));
                pedidoModel.setBairroCliente(rs.getString("bairro_cliente_pedido"));
                pedidoModel.setIdCliente(rs.getInt("id_cliente_pedido"));
                pedidoModel.setDataCadCliente(corretores.converterParaJava(rs.getString("dataCadastro_cliente_pedido")));
                lista.add(pedidoModel);                
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar clientes: " + e);
        }

        return lista;
    }

}
