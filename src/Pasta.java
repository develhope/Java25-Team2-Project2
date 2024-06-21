public class Pasta extends Prodotti{

    private String formatoPasta;
    private Integer tempoDiCottura;
    private Boolean integrale;

    public Pasta(String tipo, String produttore, String descrizione, Double prezzo, String formatoPasta, Integer tempoDiCottura, Boolean integrale) {
        super(tipo, produttore, descrizione, prezzo);
        this.formatoPasta = formatoPasta;
        this.tempoDiCottura = tempoDiCottura;
        this.integrale = integrale;
    }

    public String getFormatoPasta() {
        return formatoPasta;
    }

    public void setFormatoPasta(String formatoPasta) {
        this.formatoPasta = formatoPasta;
    }

    public Integer getTempoDiCottura() {
        return tempoDiCottura;
    }

    public void setTempoDiCottura(Integer tempoDiCottura) {
        this.tempoDiCottura = tempoDiCottura;
    }

    public Boolean getIntegrale() {
        return integrale;
    }

    public void setIntegrale(Boolean integrale) {
        this.integrale = integrale;
    }

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println("Formato: " + formatoPasta + " Tempo di cottura: " + tempoDiCottura + " Integrale: " + integrale);
    }

}
