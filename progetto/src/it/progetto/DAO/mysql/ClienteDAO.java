package it.progetto.DAO.mysql;

import it.progetto.DAO.interfaces.IBaseDAO;
import it.progetto.DAO.interfaces.IClienteDAO;
import it.progetto.dbinterface.DbConnection;
import it.progetto.model.Cliente;
import it.progetto.model.Prodotto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ClienteDAO implements IBaseDAO<Cliente> {
    private static ClienteDAO instance;

    public static ClienteDAO getInstance() {
        if(instance == null)
            instance = new ClienteDAO();
        return instance;
    }

    public Cliente findByEmail(String email) {
        return null;

    }

    @Override
    public ArrayList<Cliente> findAll() {
        return null;
    }
}
