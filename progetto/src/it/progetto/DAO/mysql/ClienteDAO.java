package it.progetto.DAO.mysql;

import it.progetto.DAO.interfaces.IClienteDAO;
import it.progetto.dbinterface.DbConnection;
import it.progetto.model.Cliente;

import java.util.ArrayList;

public class ClienteDAO implements IClienteDAO {
    private static ClienteDAO instance;

    public static ClienteDAO getInstance() {
        if(instance == null)
            instance = new ClienteDAO();
        return instance;
    }

    public Cliente findByEmail(String email) {//Order
        return null;
    }

    @Override
    public ArrayList<Cliente> findAll() {
        return null;
    }
}
