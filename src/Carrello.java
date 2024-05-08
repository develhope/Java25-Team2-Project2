import java.util.ArrayList;

public class Carrello {

    private ArrayList<Articoli> articoli;

    public Carrello () {
        articoli = new ArrayList<>();
    }

    public void aggiungiProdotto (Articoli articolo) {
        articoli.add(articolo);
    }

    public void rimuoviProdotto (int i) {
        articoli.remove(i);
    }

    public ArrayList<Articoli> visualizzaCarrello () {
        System.out.println("Carrello:");
        for (Articoli articolo : articoli) {
            System.out.println(articolo);
        }
        return articoli;
    }
}