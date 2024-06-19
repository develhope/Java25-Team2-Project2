import java.util.ArrayList;

public class Magazzino{
    private String nomeMagazzino;
    private String ubicazione;
    private String descrizioneMagazzino;
    private String cittaMagazzino;
    private Carrello carrello;
    private ArrayList<Prodotti> articoliMagazzino;

    public Magazzino(String nomeMagazzino, String ubicazione, String descrizioneMagazzino, String cittaMagazzino, Carrello carrello) {
        this.nomeMagazzino = nomeMagazzino;
        this.ubicazione = ubicazione;
        this.descrizioneMagazzino = descrizioneMagazzino;
        this.cittaMagazzino = cittaMagazzino;
        this.articoliMagazzino = new ArrayList<>();
        this.carrello = carrello;
    }

    public String getNomeMagazzino() {
        return nomeMagazzino;
    }

    public void setNomeMagazzino(String nomeMagazzino) {
        this.nomeMagazzino = nomeMagazzino;
    }

    public String getUbicazione() {
        return ubicazione;
    }

    public void setUbicazione(String ubicazione) {
        this.ubicazione = ubicazione;
    }

    public String getDescrizioneMagazzino() {
        return descrizioneMagazzino;
    }

    public void setDescrizioneMagazzino(String descrizioneMagazzino) {
        this.descrizioneMagazzino = descrizioneMagazzino;
    }

    public String getCittaMagazzino() {
        return cittaMagazzino;
    }

    public void setCittaMagazzino(String cittaMagazzino) {
        this.cittaMagazzino = cittaMagazzino;
    }

    public Carrello getCarrello() {
        return carrello;
    }

    public void setCarrello(Carrello carrello) {
        this.carrello = carrello;
    }

    public void aggiungiArticoloMagazzino (Prodotti articolo) {
        articoliMagazzino.add(articolo);
    }

    public void rimuoviArticoloMagazzino (Prodotti articolo) {
        articoliMagazzino.remove(articolo);
    }

    public void visualizzaDettagliMagazzino() {
        System.out.println("Il magazzino " + getNomeMagazzino() + " si trova a: " + getCittaMagazzino() + " in " + getUbicazione());
        System.out.println("Questo magazzino " + getDescrizioneMagazzino());
    }

    public void listaArticoliMagazzino() {
        System.out.println(nomeMagazzino);
        for (Prodotti articoli : articoliMagazzino) {
            articoli.stampaDettagli();
        }
    }
}