package it.progetto.view;

import it.progetto.model.Prodotto;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListaProdottiTableModel extends AbstractTableModel {

    private ArrayList<Prodotto> listaprodotti;

    public ListaProdottiTableModel(ArrayList<Prodotto> listaprodotti){
        this.listaprodotti =listaprodotti;
    }




    @Override
    public int getRowCount() {
        return listaprodotti.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        if(columnIndex == 2) return Boolean.class;
        return String.class;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
