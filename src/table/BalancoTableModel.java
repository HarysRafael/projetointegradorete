package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.PedidoModel;

public class BalancoTableModel extends AbstractTableModel {

    
    public static final int COL_ID_CLIENTE = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_BAIRRO_CLIENTE = 2;
    public static final int COL_DATACAD_CLIENTE = 3;
    public static final int COL_ID_PEDIDO = 4;
    public static final int COL_VALOR_PEDIDO = 5;
    public static final int COL_DATA_PEDIDO = 6;
    

    public ArrayList<PedidoModel> lista;

    public BalancoTableModel(ArrayList<PedidoModel> listaPedidoModel) {
        lista = new ArrayList<PedidoModel>(listaPedidoModel);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        PedidoModel pedidoModel = lista.get(linhas);
        if (colunas == COL_ID_CLIENTE) {
            return pedidoModel.getIdCliente();
        }
        if (colunas == COL_NOME_CLIENTE) {
            return pedidoModel.getNomeCliente();
        }
        if (colunas == COL_BAIRRO_CLIENTE) {
            return pedidoModel.getBairroCliente();
        }
        if (colunas == COL_DATACAD_CLIENTE) {
            return pedidoModel.getDataCadCliente();
        }
        if (colunas == COL_ID_PEDIDO) {
            return pedidoModel.getId();
        }
        if (colunas == COL_VALOR_PEDIDO) {
            return pedidoModel.getTotal();
        }
        if (colunas == COL_DATA_PEDIDO) {
            return pedidoModel.getData();
        }
        return "";
    }

    @Override
    public String getColumnName(int colunas) {
        if (colunas == COL_ID_CLIENTE) {
            return "Cód. Cliente";
        }
        if (colunas == COL_NOME_CLIENTE) {
            return "Nome";
        }
        if (colunas == COL_BAIRRO_CLIENTE) {
            return "Bairro";
        }
        if (colunas == COL_DATACAD_CLIENTE) {
            return "Data Cad. Cliente";
        }
        if (colunas == COL_ID_PEDIDO) {
            return "Cód. Pedido";
        }
        if (colunas == COL_VALOR_PEDIDO) {
            return "Valor";
        }
        if (colunas == COL_DATA_PEDIDO) {
            return "Data Pedido";
        }
        return "";
    }

}