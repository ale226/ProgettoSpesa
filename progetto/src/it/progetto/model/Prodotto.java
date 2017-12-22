package it.progetto.model;

public class Prodotto {

    private String nome;
    private float prezzo;
    private String descrizione;
    private int percentuale_sconto;
    private boolean disponibile;

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPercentuale_sconto() {
        return percentuale_sconto;
    }

    public void setPercentuale_sconto(int percentuale_sconto) {
        this.percentuale_sconto = percentuale_sconto;
    }
}
