package it.progetto.model;

public class Gestore extends Guest {
    public boolean loggato = true;
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

    @Override
    public boolean isLoggato() {
        return loggato;
    }

    @Override
    public void setLoggato(boolean loggato) {
        this.loggato = loggato;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public byte[] getPassword() {
        return password;
    }

    @Override
    public void setPassword(byte[] password) {
        this.password = password;
    }
}
