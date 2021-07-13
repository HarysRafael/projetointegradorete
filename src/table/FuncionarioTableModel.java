package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FuncionarioModel;

public class FuncionarioTableModel extends AbstractTableModel{
   
    public static final int COL_ID_FUNCIONARIO = 0;
    public static final int COL_NOME_FUNCIONARIO = 1;
    public static final int COL_EMAIL_FUNCIONARIO = 2;
    public static final int COL_TELEFONE_FUNCIONARIO = 3;
    public static final int COL_DATACONTRATO_FUNCIONARIO = 4;
    public ArrayList<FuncionarioModel> lista;
    
    public FuncionarioTableModel(ArrayList<FuncionarioModel>listaFuncionarioModel){
        lista = new ArrayList<FuncionarioModel>(listaFuncionarioModel);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        FuncionarioModel funcionarioModel = lista.get(linhas);
        if(colunas == COL_ID_FUNCIONARIO) return funcionarioModel.getId();
        if(colunas == COL_NOME_FUNCIONARIO) return funcionarioModel.getNome();
        if(colunas == COL_EMAIL_FUNCIONARIO) return funcionarioModel.getEmail();
        if(colunas == COL_TELEFONE_FUNCIONARIO) return funcionarioModel.getTelefone();
        if(colunas == COL_DATACONTRATO_FUNCIONARIO) return funcionarioModel.getDataContrato();
        return"";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_ID_FUNCIONARIO) return "Código";
        if(colunas == COL_NOME_FUNCIONARIO) return "Nome";
        if(colunas == COL_EMAIL_FUNCIONARIO) return "E-mail";
        if(colunas == COL_TELEFONE_FUNCIONARIO) return "Telefone";
        if(colunas == COL_DATACONTRATO_FUNCIONARIO) return "Contratado";
        return"";
    }
    
}
