package it.progetto.view;

import it.progetto.DAO.mysql.ProdottoDAO;
import it.progetto.model.Prodotto;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class Catalogo extends AbstractTableModel {

    private ArrayList<Prodotto> prodotto;
    private String columnNames[] = {"Nome","Descrizione","Prezzo","Produttore", "Distributore", "Disponibile"};
    public CatalogoTableModel(ArrayList<Prodotto> prodotto) {
        this.prodotto= prodotto;
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if(columnIndex == 6) return Boolean.class;
        return String.class;
    }


    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return prodotto.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
