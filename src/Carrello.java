import java.util.ArrayList;
import java.util.Scanner;

//todo togliere scanner.
public class Carrello {

    public ArrayList<Prodotti> articoli;
    Scanner scanner;

    //todo inserire come field totale carrello, nome carrello, lista prodotti.
    public Carrello() {
        articoli = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //todo ogni volta che aggiungiamo si somma l'articolo al totale. un field come contatore
    public ArrayList<Prodotti> aggiungiProdotto(Prodotti articolo) {
        articoli.add(articolo);
        //todo sommare articolo e aggiornare il totale.
        return articoli;
    }

    //todo sottrarre il costo anche.
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
    //todo eliminare
    public String finalizzaOperazioneVendita() {
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