public class Smartphone extends Articolo {
    private String tipo;
    private String produttore;
    private String modello;
    private String descrizioneFacoltativa;
    private String dimensioneDisplay;
    private String dimensioneSpazioArchiviazione;
    private String prezzoAcquisto;
    private String prezzoVendita;
    private String id;

    public Smartphone(String tipo, String produttore, String modello, String descrizioneFacoltativa, String dimensioneDisplay, String dimensioneSpazioArchiviazione, String prezzoAcquisto, String prezzoVendita, String id) {
        this.tipo = tipo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizioneFacoltativa = descrizioneFacoltativa;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getDescrizioneFacoltativa() {
        return descrizioneFacoltativa;
    }

    public void setDescrizioneFacoltativa(String descrizioneFacoltativa) {
        this.descrizioneFacoltativa = descrizioneFacoltativa;
    }

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public String getDimensioneSpazioArchiviazione() {
        return dimensioneSpazioArchiviazione;
    }

    public void setDimensioneSpazioArchiviazione(String dimensioneSpazioArchiviazione) {
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
    }

    public String getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(String prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public String getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(String prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "tipo='" + tipo + '\'' +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizioneFacoltativa='" + descrizioneFacoltativa + '\'' +
                ", dimensioneDisplay='" + dimensioneDisplay + '\'' +
                ", dimensioneSpazioArchiviazione='" + dimensioneSpazioArchiviazione + '\'' +
                ", prezzoAcquisto='" + prezzoAcquisto + '\'' +
                ", prezzoVendita='" + prezzoVendita + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}




