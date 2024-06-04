public class Smartphone extends Prodotti {

    public Smartphone(String tipo, String produttore, String modello, String descrizioneDispositivo, Double prezzoAcquisto, Double prezzoVendita, Integer idProdotto, Double dimensioneDisplay, Integer dimensioneSpazioArchiviazione) {
        super(tipo, produttore, modello, descrizioneDispositivo, prezzoAcquisto, prezzoVendita, idProdotto);
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
    }

    private Double dimensioneDisplay;
    private Integer dimensioneSpazioArchiviazione;

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

}
