/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MarceloMartinsVilara
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] coluna = null;
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColuna(col);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the coluna
     */
    public String[] getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(String[] coluna) {
        this.coluna = coluna;
    }
    
  /*  @Override
    public int getColumnCount(){  // retorna o número de colunas da tabela
        return coluna.length;
    }*/
    
    @Override
    public int getRowCount(){   // retorna o número de linhas da tabela
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int numCol){  // retorna o nome da coluna referente ao numCol
        return coluna[numCol];
    }
    
    @Override
    public Object getValueAt(int numLin, int numCol){  // retorna o valor do campo referente a referencia da linha e da coluna
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }

    @Override
    public int getColumnCount() {
        return coluna.length;  // retorna o número de colunas da tabela
    }
}
