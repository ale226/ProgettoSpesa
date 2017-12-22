package it.progetto.DAO.interfaces;

import java.util.ArrayList;

public interface IProdottoDAO<T>{
    ArrayList<T> findAll();
}
