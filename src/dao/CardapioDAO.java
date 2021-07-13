package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.CardapioModel;
import util.Conexao;
import util.Corretores;

public class CardapioDAO {

    private ArrayList<CardapioModel> lista = new ArrayList<CardapioModel>();
    private Connection conn;
    private Corretores corretores;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;

    public CardapioDAO() {
        conn = new Conexao().getConnection();
    }

    public void cadastrarCardapio(CardapioModel cardapioModel) {

        String sql = "INSERT INTO tbl_cardapio (nome_cardapio, valor_cardapio) VALUES (?,?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cardapioModel.getNome());
            stmt.setDouble(2, cardapioModel.getValor());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar item: " + e);
        }

    }

    public void editarCardapio(CardapioModel cardapioModel) {
        String sql = "UPDATE tbl_cardapio SET nome_cardapio = ?, valor_cardapio = ? WHERE id_cardapio = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cardapioModel.getNome());
            stmt.setDouble(2, cardapioModel.getValor());
            stmt.setInt(3, cardapioModel.getId());
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao editar item: " + e);
        }

    }

    public void excluir(int id) {
        String sql = "DELETE FROM tbl_cardapio WHERE id_cardapio =" + id;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar item: " + e);
        }

    }

    public ArrayList<CardapioModel> listarTodos() {

        String sql = "SELECT * FROM tbl_cardapio";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                CardapioModel cardapioModel = new CardapioModel();
                cardapioModel.setId(rs.getInt("id_cardapio"));
                cardapioModel.setNome(rs.getString("nome_cardapio"));
                cardapioModel.setValor(rs.getDouble("valor_cardapio"));
                lista.add(cardapioModel);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar cardapio: " + e);
        }

        return lista;
    }

    public ArrayList<CardapioModel> encontrarPorNome(String nome) {

        String sql = "SELECT * FROM tbl_cardapio WHERE nome_cardapio LIKE '%" + nome + "%'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                CardapioModel cardapioModel = new CardapioModel();
                cardapioModel.setId(rs.getInt("id_cardapio"));
                cardapioModel.setNome(rs.getString("nome_cardapio"));
                cardapioModel.setValor(rs.getDouble("valor_cardapio"));
                lista.add(cardapioModel);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar item: " + e);
        }

        return lista;
    }

}
