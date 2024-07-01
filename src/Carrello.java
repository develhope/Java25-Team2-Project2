import java.util.ArrayList;

public class Carrello {

    private String nomeCarrello;
    private Double totaleCarrello;
    private ArrayList<Prodotti> articoli;

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
        calcolaTotale();
    }

    public void rimuoviProdotto(Prodotti articolo) {
        articoli.remove(articolo);
        calcolaTotale();
    }

    private void visualizzaArticoliCarrello() {
        for (Prodotti prodotto : articoli) {
            System.out.println(prodotto.stampaDettagliProdotto());
        }
    }

    public Double calcolaTotale () {
        this.totaleCarrello = 0.0;
        for (Prodotti articolo : articoli) {
            totaleCarrello += articolo.getPrezzo();
        }
        return totaleCarrello;
    }

    public void calcoloMediaPrezzi() {
        calcolaTotale();
        Double result = totaleCarrello / articoli.size();
        System.out.println("Il prezzo medio di ogni articolo è di: " + result);
    }

    public void stampaDettagliCarrello () {
        System.out.println("Carrello: " + getNomeCarrello() +  "\nArticoli nel Carrello: \n");
        visualizzaArticoliCarrello();
        System.out.println("Totale: " + getTotaleCarrello());
    }

    public void finalizzaOperazioneVendita () {
        System.out.println("Riassunto acquisto:");
        visualizzaArticoliCarrello();
        articoli.clear();
        System.out.println("Grazie per l'acquisto.");

    }
}