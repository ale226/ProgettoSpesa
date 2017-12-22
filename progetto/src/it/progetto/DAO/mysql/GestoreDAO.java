package it.progetto.DAO.mysql;

import it.progetto.DAO.interfaces.IGestoreDAO;
import it.progetto.model.Gestore;

import java.util.ArrayList;

public class GestoreDAO implements IGestoreDAO {
    private static GestoreDAO instance;

    public static GestoreDAO getInstance() {
        if(instance == null)
            instance = new GestoreDAO();
        return instance;
    }

    public Gestore findByEmail(String email) {
        return  null;
    }

    @Override
    public ArrayList<Gestore> findAll() {
        return null;
    }
}
