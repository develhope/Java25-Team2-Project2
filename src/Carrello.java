import java.util.ArrayList;

public class Carrello {

    public ArrayList<Articoli> articoli;

    public Carrello () {
        articoli = new ArrayList<>();
    }

    public ArrayList<Articoli> aggiungiProdotto (Articoli articolo) {
        articoli.add(articolo);
        return articoli;
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
}