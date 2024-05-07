import java.util.ArrayList;

public class Carrello {

    private ArrayList<Articoli> articoli;

    public Carrello () {
        articoli = new ArrayList<>();
    }

    public void aggiungiProdotto (Articoli articolo) {
        articoli.add(articolo);
    }

    public void rimuoviProdotto (Articoli articolo) {
        articoli.remove(articolo);
    }

    public ArrayList<Articoli> visualizzaCarrello () {
        System.out.println("Carrello:");
        for (Articoli articolo : articoli) {
            System.out.println(articolo);
        }
        return articoli;
    }

    private double calcolaTotale() {
        double totale = 0;
        for (Articoli prodotto : articoli) {
            totale += prodotto.getPrezzoVendita();
        }
        return totale;
    }

    public void acquista() {
        double totale = calcolaTotale();
        System.out.println("Totale dell'acquisto: " + totale + " Euro");
        articoli.clear(); // Svuota il carrello dopo l'acquisto
    }
}