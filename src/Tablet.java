public class Tablet extends Prodotti{

    private String produttore;
    private String modello;
    private Double dimensioneDisplay;
    private Integer dimensioneSpazioArchiviazione;

    public Tablet(EnumProdottiElettronici tipo, String produttore, String modello, Double prezzo, String descrizione, Double dimensioneDisplay, Integer dimensioneSpazioArchiviazione) {
        super(tipo, descrizione, prezzo);
        this.produttore = produttore;
        this.modello = modello;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Double getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(Double dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public Integer getDimensioneSpazioArchiviazione() {
        return dimensioneSpazioArchiviazione;
    }

    public void setDimensioneSpazioArchiviazione(Integer dimensioneSpazioArchiviazione) {
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
    }

    public String stampaDettagliProdotto() {
        return super.stampaDettagliProdotto() + "\nProduttore: " + getProduttore() + "\nModello: " + getModello() + "\nDimensione display: " + getDimensioneDisplay() + "\nDimensione spazio archiviazione: " + getDimensioneSpazioArchiviazione() + '\n';
    }
}