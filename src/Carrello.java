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
        System.out.println("Carrello:\n");
        if (articoli.isEmpty()) {
            System.out.println("Il carrello è vuoto.\n");
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

    //todo eliminare
    public String finalizzaOperazioneVendita() {
        if (articoli.isEmpty()) {
            return "Il carrello è vuoto.";
        }
        Double result = 0.0;
        for (Prodotti articolo : articoli) {
            result += articolo.getPrezzoVendita();
        }
        int finalizza;
        System.out.println("Totale: " + result + "€");
        System.out.println("Procedere all'Acquisto? \n 1. Si. \n 2. No.");
        finalizza = scanner.nextInt();
        if (finalizza == 1) {;
            articoli.clear();
            return "Grazie per l'acquisto.";
        } else if (finalizza == 2) {
            return "Annullo operazione d'acquisto.";
        } else {
            System.out.println("Comando non valido.");
            finalizzaOperazioneVendita();
        }
        return "Arrivederci.";
    }
}