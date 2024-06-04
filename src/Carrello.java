import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

    public ArrayList<Prodotti> articoli;
    Scanner scanner;

    public Carrello() {
        articoli = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public ArrayList<Prodotti> aggiungiProdotto(Prodotti articolo) {
        articoli.add(articolo);
        return articoli;
    }

    public ArrayList<Prodotti> rimuoviProdotto(Prodotti articolo) {
        articoli.remove(articolo);
        return articoli;
    }

    public void visualizzaCarrello() {
        System.out.println("\nCarrello:\n");
        if (articoli.isEmpty()) {
            System.out.println("Il carrello è vuoto.");
        }
        int indice = 1;
        for (Prodotti articolo : articoli) {
            System.out.print(indice + ". ");
            System.out.println(articolo);
            indice++;
        }
    }

    public Double calcoloMediaPrezzi() {
        Double result = 0.0;
        for (Prodotti articolo : articoli) {
            result += articolo.getPrezzoVendita();
        }
        return result / articoli.size();
    }

    public void finalizzaOperazioneVendita() {
        if (articoli.isEmpty()) {
            System.out.println("\nIl carrello è vuoto.");
        }
        Double result = 0.0;
        for (Prodotti articolo : articoli) {
            result += articolo.getPrezzoVendita();
        }
        System.out.println("\nTotale: " + result + "€");
        articoli.clear();
        System.out.println("Grazie per l'acquisto.");
    }
}