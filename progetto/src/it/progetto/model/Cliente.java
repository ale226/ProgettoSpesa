package it.progetto.model;

public class Cliente extends Guest {
    public boolean loggato = true;
    public String nome;
    public String cognome;
    public String username;
    private byte[] password;
    public boolean verificato;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}
