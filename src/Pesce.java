public class Pesce extends Prodotti{

    private String varietaPesce;
    private String provenienzaPesce;

    public Pesce(String tipo, String produttore, String descrizione, Double prezzo, String varietaPesce, String provenienzaPesce) {
        super(tipo, produttore, descrizione, prezzo);
        this.varietaPesce = varietaPesce;
        this.provenienzaPesce = provenienzaPesce;
    }

    public String getVarietaPesce() {
        return varietaPesce;
    }

    public void setVarietaPesce(String varietaPesce) {
        this.varietaPesce = varietaPesce;
    }

    public String getProvenienzaPesce() {
        return provenienzaPesce;
    }

    public void setProvenienzaPesce(String provenienzaPesce) {
        this.provenienzaPesce = provenienzaPesce;
    }

    @Override
    public void stampaDettagli () {
        super.stampaDettagli();
        System.out.println("Varietà Pesce: " + varietaPesce + " Provenienza Pesce: " + provenienzaPesce);
    }
}
