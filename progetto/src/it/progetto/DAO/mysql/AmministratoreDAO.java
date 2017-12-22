package it.progetto.DAO.mysql;

import it.progetto.DAO.interfaces.IAmministratoreDAO;
import it.progetto.model.Amministratore;

import java.util.ArrayList;

public class AmministratoreDAO implements IAmministratoreDAO {
    private static AmministratoreDAO instance;

    public static AmministratoreDAO getInstance() {
        if(instance == null)
            instance = new AmministratoreDAO();
        return instance;
    }


    public Amministratore findByEmail(String email) {
        return  null;
    }

    @Override
    public ArrayList<Amministratore> findAll() {
        return null;
    }
}
