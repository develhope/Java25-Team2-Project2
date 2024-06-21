public class Frutta extends Prodotti{

    private String tipologiaFrutta;
    private Boolean biologica;

    public Frutta(String tipo, String produttore, String tipologiaFrutta, String descrizione, Double prezzo, Boolean biologica) {
        super(tipo, produttore, descrizione, prezzo);
        this.tipologiaFrutta = tipologiaFrutta;
        this.biologica = biologica;
    }

    public Boolean getBiologica() {
        return biologica;
    }

    public void setBiologica(Boolean biologica) {
        this.biologica = biologica;
    }

    public String getTipologiaFrutta() {
        return tipologiaFrutta;
    }

    public void setTipologiaFrutta(String tipologiaFrutta) {
        this.tipologiaFrutta = tipologiaFrutta;
    }

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println("Varietà frutta: " + tipologiaFrutta + " Biologica: " + biologica);
    }
}

