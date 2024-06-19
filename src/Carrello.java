import java.util.ArrayList;

public class Carrello {

    private String nomeCarrello;
    private Double totaleCarrello;
    private ArrayList<Prodotti> articoli;
    private Magazzino magazzino;

    public Carrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
        this.articoli = new ArrayList<>();
        this.totaleCarrello = 0.0;
    }

    public String getNomeCarrello() {
        return nomeCarrello;
    }

    public void setNomeCarrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
    }

    public Double getTotaleCarrello() {
        return totaleCarrello;
    }

    public void setTotaleCarrello(Double totaleCarrello) {
        this.totaleCarrello = totaleCarrello;
    }

    public ArrayList<Prodotti> getArticoli() {
        return articoli;
    }

    public void setArticoli(ArrayList<Prodotti> articoli) {
        this.articoli = articoli;
    }

    public void aggiungiProdotto(Prodotti articolo) {
        articoli.add(articolo);
    }

    public void rimuoviProdotto(Prodotti articolo) {
        articoli.remove(articolo);
    }

    public void visualizzaCarrello() {
        System.out.println(nomeCarrello);
        for (Prodotti prodotti : articoli) {
            prodotti.stampaDettagli();
        }
    }

    public void calcoloMediaPrezzi() {
        Double totaleCarrello = 0.0;
        System.out.print("\nIl prezzo medio di ogni articolo è di: ");
        for (Prodotti articolo : articoli) {
            totaleCarrello += articolo.getPrezzo();
        }
        Double result = totaleCarrello / articoli.size();
        System.out.println(result);
    }
}