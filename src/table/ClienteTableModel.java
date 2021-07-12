package table;

import javax.swing.table.AbstractTableModel;
import model.ClienteModel;
import java.util.ArrayList;

public class ClienteTableModel extends AbstractTableModel{

    public static final int COL_ID_CLIENTE = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_EMAIL_CLIENTE = 2;
    public static final int COL_TELEFONE_CLIENTE = 3;
    public static final int COL_RUA_CLIENTE = 4;
    public static final int COL_BAIRRO_CLIENTE = 5;
    public static final int COL_CIDADE_CLIENTE = 6;
    public static final int COL_DATACADASTRO_CLIENTE = 7;
    public ArrayList<ClienteModel> lista;

    public ClienteTableModel(ArrayList<ClienteModel>listaClienteModel) {
        lista = new ArrayList<ClienteModel>(listaClienteModel);
    }
    
    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        ClienteModel clienteModel = lista.get(linhas);
        if(colunas == COL_ID_CLIENTE) return clienteModel.getId();
        if(colunas == COL_NOME_CLIENTE) return clienteModel.getNome();
        if(colunas == COL_EMAIL_CLIENTE) return clienteModel.getEmail();
        if(colunas == COL_TELEFONE_CLIENTE) return clienteModel.getTelefone();
        if(colunas == COL_RUA_CLIENTE) return clienteModel.getRua();
        if(colunas == COL_BAIRRO_CLIENTE) return clienteModel.getBairro();
        if(colunas == COL_CIDADE_CLIENTE) return clienteModel.getCidade();
        if(colunas == COL_DATACADASTRO_CLIENTE) return clienteModel.getDataCadastro();
            
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
   
        if(colunas == COL_ID_CLIENTE) return "Código";
        if(colunas == COL_NOME_CLIENTE) return "Nome";
        if(colunas == COL_EMAIL_CLIENTE) return "E-Mail";
        if(colunas == COL_TELEFONE_CLIENTE) return "Telefone";
        if(colunas == COL_RUA_CLIENTE) return "Rua";
        if(colunas == COL_BAIRRO_CLIENTE) return "Bairro";
        if(colunas == COL_CIDADE_CLIENTE) return "Cidade";
        if(colunas == COL_DATACADASTRO_CLIENTE) return "Data Cadastro";
        return"";
        
    }
    
}
