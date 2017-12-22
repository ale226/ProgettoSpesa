package it.progetto.DAO.mysql;

import it.progetto.DAO.interfaces.IBaseDAO;
import it.progetto.DAO.interfaces.IProdottoDAO;
import it.progetto.dbinterface.DbConnection;
import it.progetto.model.Prodotto;

import java.util.ArrayList;
import java.util.Iterator;

public class ProdottoDAO implements IProdottoDAO<Prodotto> {
    private static ProdottoDAO instance;

    public static ProdottoDAO getInstance() {
        if(instance == null)
            instance = new ProdottoDAO();
        return instance;
    }



    @Override
    public ArrayList findAll() {

        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM prodotto");

        ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();

        Iterator<String[]> i = risultato.iterator();

        while(i.hasNext()) {
            String[] riga = i.next();
            Prodotto prodotto = new Prodotto();
            prodotto.setIdDistributore();
            prodotto.setIdProduttore();
            prodotto.setNome();
            prodotto.setPrezzo();
            prodotto.setSconto();
            listaProdotti.add(prodotto);
        }

        return listaProdotti;

        return null;
    }
}
