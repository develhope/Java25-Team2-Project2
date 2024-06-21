public class Carne extends Prodotti{

    private String varietaCarne;
    private Boolean provenienzaAllevamento;

    public Carne(String tipo, String produttore, String descrizione, Double prezzo, String varietaCarne, Boolean provenienzaAllevamento) {
        super(tipo, produttore, descrizione, prezzo);
        this.varietaCarne = varietaCarne;
        this.provenienzaAllevamento = provenienzaAllevamento;
    }

    public String getVarietaCarne() {
        return varietaCarne;
    }

    public void setVarietaCarne(String varietaCarne) {
        this.varietaCarne = varietaCarne;
    }

    public Boolean getProvenienzaAllevamento() {
        return provenienzaAllevamento;
    }

    public void setProvenienzaAllevamento(Boolean provenienzaAllevamento) {
        this.provenienzaAllevamento = provenienzaAllevamento;
    }

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println("Varietà Carne: " + varietaCarne + " Proveniente d'Allevamento: " + provenienzaAllevamento);
    }

}
