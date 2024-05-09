
public class Tablet extends Articoli {

    private String produttore;
    private String descrizioneDispositivo;
    private String dimensioneDisplay;
    private String dimensioneSpazioArchiviazione;
    private String prezzoAcquisto;
    private String idDispositivo;

    public Tablet(Tipo tipo, String produttore, String modello, String descrizioneDispositivo, String dimensioneDisplay, String dimensioneSpazioArchiviazione, String prezzoAcquisto, Double prezzoVendita, String idDispositivo) {

        this.tipo = tipo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizioneDispositivo = descrizioneDispositivo;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.idDispositivo = idDispositivo;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getdescrizioneDispositivo() {
        return descrizioneDispositivo;
    }

    public void setdescrizioneDispositivo(String descrizioneDispositivo) {
        this.descrizioneDispositivo = descrizioneDispositivo;
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

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public String toString() {
        return "Tablet  {" +
                "tipo='" + tipo + '\'' +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizioneDispositivo='" + descrizioneDispositivo + '\'' +
                ", dimensioneDisplay='" + dimensioneDisplay + '\'' +
                ", dimensioneSpazioArchiviazione='" + dimensioneSpazioArchiviazione + '\'' +
                ", prezzoAcquisto='" + prezzoAcquisto + '\'' +
                ", prezzoVendita='" + prezzoVendita + '\'' +
                ", idDispositivo='" + idDispositivo + '\'' +
                '}';
    }
}