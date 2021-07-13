package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.CardapioModel;

public class CardapioTableModel extends AbstractTableModel{
     public static final int COL_ID_CARDAPIO = 0;
    public static final int COL_NOME_CARDAPIO = 1;
    public static final int COL_VALOR_CARDAPIO = 2;
    public ArrayList<CardapioModel> lista;

    public CardapioTableModel(ArrayList<CardapioModel>listaCardapioModel) {
        lista = new ArrayList<CardapioModel>(listaCardapioModel);
    }
   
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        CardapioModel cardapioModel = lista.get(linhas);
        if(colunas == COL_ID_CARDAPIO) return cardapioModel.getId();
        if(colunas == COL_NOME_CARDAPIO) return cardapioModel.getNome();
        if(colunas == COL_VALOR_CARDAPIO) return cardapioModel.getValor();            
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_ID_CARDAPIO) return "Código";
        if(colunas == COL_NOME_CARDAPIO) return "Produto";
        if(colunas == COL_VALOR_CARDAPIO) return "Valor";
        return"";        
    }
    
}
