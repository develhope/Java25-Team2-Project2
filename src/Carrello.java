import java.util.ArrayList;

public class Carrello {

    public ArrayList<ArticoliElettronici> articoli;

    public Carrello () {
        articoli = new ArrayList<>();
    }

    public ArrayList<ArticoliElettronici> aggiungiProdotto (ArticoliElettronici articolo) {
        articoli.add(articolo);
        return articoli;
    }

    public void rimuoviProdotto (ArticoliElettronici articolo) {
        articoli.remove(articolo);
    }


    public ArrayList<ArticoliElettronici> visualizzaCarrello () {
        System.out.println("Carrello:");
        int indice = 1;
        for (ArticoliElettronici articolo : articoli) {
            System.out.print(indice + ". ");
            System.out.println(articolo);
            indice++;
        }
        return articoli;
    }
}