import java.util.ArrayList;

public class Carrello {

    public String nomeCarrello;
    public Double totaleCarrello;
    public ArrayList<Prodotti> articoli;

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
        for (Prodotti prodotto : articoli) {
            System.out.println(prodotto);
        }
    }

    public Double calcolaTotale () {
        this.totaleCarrello = 0.0;
        for (Prodotti articolo : articoli) {
            totaleCarrello += articolo.getPrezzoVendita();
        }
        return totaleCarrello;
    }

    public void calcoloMediaPrezzi() {
        calcolaTotale();
        Double result = totaleCarrello / articoli.size();
        System.out.println(result);
    }

    public void stampaDettagli () {
        System.out.println("Carrello: " + getNomeCarrello() + " Totale: " + getTotaleCarrello() + " Articoli nel Carrello: ");
        visualizzaCarrello();
    }
}