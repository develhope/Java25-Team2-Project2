public class Pane extends Prodotti{

        private String formatoPane;
        private String tipoDiFarina;

    public Pane(String tipo, String produttore, String descrizione, Double prezzo, String formatoPane, String tipoDiFarina) {
        super(tipo, produttore, descrizione, prezzo);
        this.formatoPane = formatoPane;
        this.tipoDiFarina = tipoDiFarina;
    }

    public String getFormatoPane() {
        return formatoPane;
    }

    public void setFormatoPane(String formatoPane) {
        this.formatoPane = formatoPane;
    }

    public String getTipoDiFarina() {
        return tipoDiFarina;
    }

    public void setTipoDiFarina(String tipoDiFarina) {
        this.tipoDiFarina = tipoDiFarina;
    }

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println("Formato: " + formatoPane + " Tipo di farina utilizzata: " + tipoDiFarina);
    }
}
