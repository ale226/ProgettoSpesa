package it.progetto.DAO.mysql;

import it.progetto.dbinterface.DbConnection;
import it.progetto.model.Amministratore;
import it.progetto.model.Cliente;
import it.progetto.model.Gestore;
import it.progetto.model.Guest;
import it.progetto.DAO.interfaces.*;

import java.util.ArrayList;

public class GuestDAO implements IGuestDAO{

    private static GuestDAO instance;

    public static GuestDAO getInstance() {
        if(instance == null)
            instance = new GuestDAO();
        return instance;
    }

    @Override
    public Guest findUserByEmailAndPassword(String email, byte[] password) {

        Guest guest = null;


        String query = "SELECT * FROM utente WHERE " +
                "Email = '"+email+"' AND " +
                "password = '"+new String(password)+"'";
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(query);

        if(ris.size() != 0) {
            //esiste un utente !!
            String[] utente = ris.get(0);
            //VEDIAMO SE E' UN CLIENTE
            Cliente cliente= ClienteDAO.getInstance().findByEmail(email);
            if(cliente==null) {//SE NON E' UN CLIENTE
                //VEDIAMO SE E' UN AMMINISTRATORE
                Amministratore amministratore = AmministratoreDAO.getInstance().findByEmail(email);
                if (amministratore == null) {//NON E' AMMINISTRATORE
                    //VEDIAMO SE E' GESTORE
                    Gestore gestore = GestoreDAO.getInstance().findByEmail(email);
                    if (gestore != null)
                        guest = gestore;
                }
                else
                    guest = amministratore;
            }
            //query = "SELECT verificato " +
            //        "FROM utente JOIN cliente " +
            //        "ON utente.cliente_idcliente = cliente.idcliente " +
            //        "WHERE utente.email='"+email+"'";
            //ris = DbConnection.getInstance().eseguiQuery(query);
            //utente = ris.get(0);
            //boolean verificato = utente[0];
            //if(verificato)
            guest= cliente;
            if(guest!=null) {
                guest.setUsername(email);
                guest.setLoggato(true);
            }

        }

        return guest;
    }



    @Override
    public Guest findByEmail(String email) {
        return null;
    }

    @Override
    public ArrayList<Guest> findAll() {
        return null;
    }

}
