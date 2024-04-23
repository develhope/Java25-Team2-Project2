// Definizione dei Tablet

public class Tablet {

    private String modello;
    private String marca;
    private String prezzoAcquisto;
    private String prezzoVendita;
    private String prezzoAcquistoIVA;
    private String prezzoVenditaIVA;
    private String quantitaDisponibile;
    private String dimensioneDisplay;
    private String spazioArchiviazione;
    private String id;
    private String descrizione;

    // Costruttori
    public Tablet() {
        this.modello = "Selezionabile";
        this.marca = "Selezionabile";
        this.prezzoAcquisto = "0.0";
        this.prezzoVendita = "0.0";
        this.prezzoAcquistoIVA = "0.0";
        this.prezzoVenditaIVA = "0.0";
        this.quantitaDisponibile = "0";
        this.dimensioneDisplay = "indefinito";
        this.spazioArchiviazione = "indefinito";
        this.id = "1";
        this.descrizione = "";
    }

    public Tablet(String modello, String marca, String prezzoAcquisto, String prezzoVendita, String quantitaDisponibile,
                  String dimensioneDisplay, String spazioArchiviazione, String id, String descrizione) {
        this.modello = modello;
        this.marca = marca;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.prezzoAcquistoIVA = prezzoAcquisto; // 22% di IVA
        this.prezzoVenditaIVA = prezzoVendita; // 22% di IVA
        this.quantitaDisponibile = quantitaDisponibile;
        this.dimensioneDisplay = dimensioneDisplay;
        this.spazioArchiviazione = spazioArchiviazione;
        this.id = id;
        this.descrizione = descrizione;
    }

    // Getter e Setter
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getPrezzoAcquistoIVA() {
        return prezzoAcquistoIVA;
    }

    public String getPrezzoVenditaIVA() {
        return prezzoVenditaIVA;
    }

    public String getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(String quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public String getSpazioArchiviazione() {
        return spazioArchiviazione;
    }

    public void setSpazioArchiviazione(String spazioArchiviazione) {
        this.spazioArchiviazione = spazioArchiviazione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Tablet      {" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzoAcquisto='" + prezzoAcquisto + '\'' +
                ", prezzoVendita='" + prezzoVendita + '\'' +
                ", prezzoAcquistoIVA='" + prezzoAcquistoIVA + '\'' +
                ", prezzoVenditaIVA='" + prezzoVenditaIVA + '\'' +
                ", quantitaDisponibile='" + quantitaDisponibile + '\'' +
                ", dimensioneDisplay='" + dimensioneDisplay + '\'' +
                ", spazioArchiviazione='" + spazioArchiviazione + '\'' +
                ", id='" + id + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}

