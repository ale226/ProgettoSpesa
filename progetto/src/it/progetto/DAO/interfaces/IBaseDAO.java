package it.progetto.DAO.interfaces;

import java.util.ArrayList;

public interface IBaseDAO<T> {
    T findByEmail(String email);

    ArrayList<T> findAll();
}
