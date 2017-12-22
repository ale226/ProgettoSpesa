package it.progetto.model;

import java.util.ArrayList;

public class Cliente extends Guest {
    private boolean loggato = true;
    private String nome;
    private String cognome;
    private String email;
    private byte[] password;
    private boolean verificato;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private ArrayList<Prodotto> listaprodotti;

    public ArrayList<Prodotto> getListaprodotti() {
        return listaprodotti;
    }

    public void setListaprodotti(ArrayList<Prodotto> listaprodotti) {
        this.listaprodotti = listaprodotti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public boolean isVerificato() {
        return verificato;
    }

    public void setVerificato(boolean verificato) {
        this.verificato = verificato;
    }

    public boolean isLoggato() {
        return loggato;
    }

    public void setLoggato(boolean loggato) {
        this.loggato = loggato;
    }


    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}
