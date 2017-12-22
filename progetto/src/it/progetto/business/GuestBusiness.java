package it.progetto.business;

import it.progetto.DAO.mysql.GuestDAO;
import it.progetto.model.Guest;

public class GuestBusiness {
    private static GuestBusiness instance;

    public static GuestBusiness getInstance() {
        if(instance == null)
            instance = new GuestBusiness();
        return instance;
    }

    public Guest login(String email, byte[] password) {

        Guest guest = GuestDAO.getInstance().findUserByEmailAndPassword(email, password);

        return guest;
    }
}
