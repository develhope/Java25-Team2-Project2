public class Smartphone extends Articoli {

    private Tipo tipo;
    private String produttore;
    private String modello;
    private String descrizioneDispositivo;
    private String dimensioneDisplay;
    private String dimensioneSpazioArchiviazione;
    private String prezzoAcquisto;
    private Double prezzoVendita;
    private String idDispositivo;

    public Smartphone(Tipo tipo, String produttore, String modello, String descrizioneDispositivo, String dimensioneDisplay, String dimensioneSpazioArchiviazione, String prezzoAcquisto, Double prezzoVendita, String idDispositivo) {
        super();
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
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

    public Double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(Double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public String toString() {
        return "Smartphone  {" +
                "tipo='" + tipo + '\'' +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizioneDispositivo='" + descrizioneDispositivo + '\'' +
                ", dimensioneDisplay='" + dimensioneDisplay + '\'' +
                ", dimensioneSpazioArchiviazione='" + dimensioneSpazioArchiviazione + '\'' +
                ", prezzoAcquisto='" + prezzoAcquisto + '\'' +
                ", prezzoVendita='" + prezzoVendita + '\'' +
                ", idDispositivo='" + idDispositivo + '\'' +
                "}";
    }
}




