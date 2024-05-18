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

    public void rimuoviProdotto(ArticoliElettronici articolo) {
        articoli.remove(articolo);
    }

    public ArrayList<ArticoliElettronici> visualizzaCarrello() {
        System.out.println("Carrello:");
        int indice = 1;
        for (ArticoliElettronici articolo : articoli) {
            System.out.print(indice + ". ");
            System.out.println(articolo);
            indice++;
        }
        return articoli;
    }

    public Double calcoloMediaPrezzi() {
        Double result = 0.0;
        for (ArticoliElettronici articolo : articoli) {
            result += articolo.checkPrezzoVendita();
        }
        return result / articoli.size();
    }
//TODO sistemare loop e mettere condizione affinchè si esca dal metodo se la lista articoli è vuota.
    public void finalizzaOperazioneVendita () {
        Double result = 0.0;
        for (ArticoliElettronici articolo : articoli) {
            result += articolo.checkPrezzoVendita();
        }
        Integer finalizza;
        do {
            System.out.println("Totale: " + result + "€");
            System.out.println("Procedere all'Acquisto? \n 1. Si. \n 2. No.");
            finalizza = scanner.nextInt();
            if (finalizza == 1) {
                System.out.print("Grazie per l'acquisto.");
                articoli.clear();
            } else if (finalizza == 2) {
                System.out.println("Annullo operazione d'acquisto.");
            } else if (finalizza <= 0 || finalizza >= 3) {
                System.out.println("Comando non valido.");
            }
        } while (finalizza != 1 || finalizza != 2 );
    }
}