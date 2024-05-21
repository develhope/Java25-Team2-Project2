import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

    public ArrayList<ArticoliElettronici> articoli;
    Scanner scanner;

    public Carrello() {
        articoli = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public ArrayList<ArticoliElettronici> aggiungiProdotto(ArticoliElettronici articolo) {
        articoli.add(articolo);
        return articoli;
    }

    public ArrayList<ArticoliElettronici> rimuoviProdotto(ArticoliElettronici articolo) {
        articoli.remove(articolo);
        return articoli;
    }

    public void visualizzaCarrello() {
        System.out.println("Carrello:\n");
        int indice = 1;
        for (ArticoliElettronici articolo : articoli) {
            if (articoli.isEmpty()) {
                System.out.println("Il carrello è vuoto.");
            } else {
                System.out.print(indice + ". ");
                System.out.println(articolo);
                indice++;
            }
        }
    }

    public Double calcoloMediaPrezzi() {
        Double result = 0.0;
        for (ArticoliElettronici articolo : articoli) {
            result += articolo.checkPrezzoVendita();
        }
        return result / articoli.size();
    }

    public void finalizzaOperazioneVendita() {
        Double result = 0.0;
        for (ArticoliElettronici articolo : articoli) {
            result += articolo.checkPrezzoVendita();
        }
        int finalizza;
        System.out.println("Totale: " + result + "€");
        System.out.println("Procedere all'Acquisto? \n 1. Si. \n 2. No.");
        finalizza = scanner.nextInt();
        if (finalizza == 1) {
            System.out.print("Grazie per l'acquisto.");
            articoli.clear();
        } else if (finalizza == 2) {
            System.out.println("Annullo operazione d'acquisto.");
        } else {
            System.out.println("Comando non valido.");
        }
    }
}