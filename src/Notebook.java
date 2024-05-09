public class Notebook implements ArticoliElettronici {

    private Tipo tipo;
    private String produttore;
    private String modello;
    private String descrizioneDispositivo;
    private Double dimensioneDisplay;
    private Integer dimensioneSpazioArchiviazione;
    private Double prezzoAcquisto;
    private Double prezzoVendita;
    private Integer idDispositivo;

    public Notebook(Tipo tipo, String produttore, String modello, String descrizioneDispositivo, Double dimensioneDisplay, Integer dimensioneSpazioArchiviazione, Double prezzoAcquisto, Double prezzoVendita, Integer idDispositivo) {
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

    @Override
    public Tipo checkTipo() {
        return tipo;
    }

    @Override
    public String checkProduttore() {
        return produttore;
    }

    @Override
    public String checkModello() {
        return modello;
    }

    @Override
    public Double checkDimensioniDisplay() {
        return dimensioneDisplay;
    }

    @Override
    public Integer checkDimensioneSpazioArchiviazione() {
        return dimensioneSpazioArchiviazione;
    }

    @Override
    public Double checkPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    @Override
    public Double checkPrezzoVendita() {
        return prezzoVendita;
    }

    @Override
    public Integer checkID() {
        return idDispositivo;
    }

    @Override
    public String toString() {
        return "Dispositivo: " + tipo +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizioneDispositivo='" + descrizioneDispositivo + '\'' +
                ", dimensioneDisplay=" + dimensioneDisplay +
                ", dimensioneSpazioArchiviazione=" + dimensioneSpazioArchiviazione +
                ", prezzoAcquisto=" + prezzoAcquisto +
                ", prezzoVendita=" + prezzoVendita +
                ", idDispositivo=" + idDispositivo;
    }
}