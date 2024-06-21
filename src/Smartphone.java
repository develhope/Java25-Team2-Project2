public class Smartphone extends Prodotti {

    private String modello;
    private Integer dimensioneSpazioArchiviazione;
    private Double dimensioneDisplay;

    public Smartphone(String tipo, String produttore, String modello, String descrizioneDispositivo, Double prezzo, Double dimensioneDisplay, Integer dimensioneSpazioArchiviazione) {
        super(tipo, produttore, descrizioneDispositivo, prezzo);
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazioArchiviazione = dimensioneSpazioArchiviazione;
        this.modello = modello;
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

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println(" Modello: " + modello + " Dimensione Display: " + dimensioneDisplay + " Dimensione Spazio Archiviazione: " + dimensioneSpazioArchiviazione);
    }

}
