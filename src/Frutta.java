public class Frutta extends Prodotti{

    private String varietaFrutta;
    private Boolean biologica;

    public Frutta(String tipo, String produttore, String varietaFrutta, String descrizione, Double prezzo, Boolean biologica) {
        super(tipo, produttore, descrizione, prezzo);
        this.varietaFrutta = varietaFrutta;
        this.biologica = biologica;
    }

    public Boolean getBiologica() {
        return biologica;
    }

    public void setBiologica(Boolean biologica) {
        this.biologica = biologica;
    }

    public String getVarietaFrutta() {
        return varietaFrutta;
    }

    public void setVarietaFrutta(String varietaFrutta) {
        this.varietaFrutta = varietaFrutta;
    }

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println("Varietà frutta: " + varietaFrutta + " Biologica: " + biologica);
    }
}

