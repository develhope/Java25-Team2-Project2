public class Notebook {

    private String tipo;
    private String produttore;
    private String modello;
    private String descrizioneDispositivo;
    private String dimensioneDisplay;
    private String spazioArchivio;
    private String prezzoAquisto;
    private String prezzoVendita;
    private String idDispositivo;

    public Notebook (String tipo, String produttore, String modello, String descrizioneDispositivo, String dimensioneDisplay, String spazioArchivio, String prezzoAquisto, String prezzoVendita, String idDispositivo) {
        this.tipo = tipo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizioneDispositivo = descrizioneDispositivo;
        this.dimensioneDisplay = dimensioneDisplay;
        this.spazioArchivio = spazioArchivio;
        this.prezzoAquisto = prezzoAquisto;
        this.prezzoVendita = prezzoVendita;
        this.idDispositivo = idDispositivo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProduttore() {
        return produttore;
    }

    public String getModello() {
        return modello;
    }

    public String getDescrizioneDispositivo() {
        return descrizioneDispositivo;
    }

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public String getSpazioArchivio() {
        return spazioArchivio;
    }

    public String getPrezzoAquisto() {
        return prezzoAquisto;
    }

    public String getPrezzoVendita() {
        return prezzoVendita;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setDescrizioneDispositivo(String descrizioneDispositivo) {
        this.descrizioneDispositivo = descrizioneDispositivo;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public void setSpazioArchivio(String spazioArchivio) {
        this.spazioArchivio = spazioArchivio;
    }

    public void setPrezzoAquisto(String prezzoAquisto) {
        this.prezzoAquisto = prezzoAquisto;
    }

    public void setPrezzoVendita(String prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public String toString() {
        return "Notebook    {" +
                "tipo='" + tipo + '\'' +
                ", produttore = '" + produttore + '\'' +
                ", modello = '" + modello + '\'' +
                ", descrizioneFacoltativa = '" + descrizioneDispositivo + '\'' +
                ", dimensioneDisplay = '" + dimensioneDisplay + '\'' +
                ", dimensioneSpazioArchiviazione = '" + spazioArchivio + '\'' +
                ", prezzoAcquisto = '" + prezzoAquisto + '\'' +
                ", prezzoVendita = '" + prezzoVendita + '\'' +
                ", id = '" + idDispositivo + '\'' +
                '}';
    }
}




