// Definizione dei Tablet

public class Tablet {

    private String modello;
    private String produttore;
    private String prezzoAcquisto;
    private String prezzoVendita;
    private String tipo;
    private String dimensioneDisplay;
    private String dimensioneSpazioArchiviazione;
    private String idDispositivo;
    private String descrizioneDispositivo;

    // Costruttori
    public Tablet() {
        this.modello = "Selezionabile";
        this.produttore = "Selezionabile";
        this.prezzoAcquisto = "0.0";
        this.prezzoVendita = "0.0";
        this.tipo = "Selezionabile";
        this.dimensioneDisplay = "indefinito";
        this.dimensioneSpazioArchiviazione = "indefinito";
        this.idDispositivo = "1";
        this.descrizioneDispositivo = "";
    }

    public Tablet(String modello, String produttore, String prezzoAcquisto, String prezzoVendita, String dimensioneDisplay, String dimensioneSpazioArchiviazione, String idDispositivo, String descrizione) {
        this.modello = modello;
        this.produttore = produttore;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.tipo = tipo;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
        this.idDispositivo = idDispositivo;
        this.descrizioneDispositivo = descrizioneDispositivo;
    }

    // Getter e Setter
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getproduttore() {
        return produttore;
    }

    public void setproduttore(String produttore) {
        this.produttore = produttore;
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

    public String tipo() {
        return tipo;
    }



    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public String getdimensioneSpazioArchiviazione() {
        return dimensioneSpazioArchiviazione;
    }

    public void setdimensioneSpazioArchiviazione(String dimensioneSpazioArchiviazione) {
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
    }

    public String getidDispositivo() {
        return idDispositivo;
    }

    public void setidDispositivo(String idDispositivo) {
        this.id = id;
    }

    public String getdescrizioneDispositivo() {
        return descrizioneDispositivo;
    }

    public void setdescrizioneDispositivo(String descrizioneDispositivo) {
        this.descrizioneDispositivo = descrizioneDispositivo;
    }

    @Override
    public String toString() {
        return "Tablet      {" +
                "modello='" + modello + '\'' +
                ", produttore='" + produttore + '\'' +
                ", prezzoAcquisto='" + prezzoAcquisto + '\'' +
                ", prezzoVendita='" + prezzoVendita + '\'' +
                ", tipo='" + tipo + '\'' +
                ", dimensioneDisplay='" + dimensioneDisplay + '\'' +
                ", dimensioneSpazioArchiviazione='" + dimensioneSpazioArchiviazione + '\'' +
                ", idDispositivo='" + idDispositivo + '\'' +
                ", descrizioneDispositivo='" + descrizioneDispositivo + '\'' +
                '}';
    }
}

