package it.progetto.DAO.interfaces;

import it.progetto.model.Guest;

public interface IGuestDAO extends IBaseDAO<Guest>{
    Guest findUserByEmailAndPassword(String email, byte[] password);
}
