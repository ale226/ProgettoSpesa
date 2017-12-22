package it.progetto.model;

public class Guest{
    public boolean loggato = false;
    public String nome;
    public String cognome;
    public String username;
    private byte[] password;

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

    public boolean isLoggato() {
        return loggato;
    }

    public void setLoggato(boolean loggato) {
        this.loggato = loggato;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String id) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}
