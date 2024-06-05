import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//todo rimuovere scanner.
public class Magazzino {

    //todo la lista è quella del carrello. aggiungiamo il carrello al magazzino e visualizziamo gli articoli tramite esso.
    ArrayList<Prodotti> listaDispositivi = new ArrayList<>();
    Scanner scanner;

    //todo nome, informazioni, descrizioni ed almeno una città.
    public Magazzino() {
    }

    //todo questi metodi vanno in prodotti.
    public void ricercaTipoDispositivo(String tipoDispositivo) {

        boolean elementoPresente = false;

        for (Prodotti articolo : listaDispositivi) {
            if (tipoDispositivo.equals(articolo.getTipo())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }

    public void ricercaProduttore(String nomeProduttore) {

        boolean elementoPresente = false;

        for (Prodotti articolo : listaDispositivi) {
            if (nomeProduttore.equals(articolo.getProduttore())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    public void ricercaModello(String nomeModello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : listaDispositivi) {
            if (nomeModello.equals(articolo.getModello())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    public void ricercaPrezzoVendita (Double prezzoVendita) {

        boolean elementoPresente = false;

        for (Prodotti articolo : listaDispositivi) {
            if (Objects.equals(prezzoVendita, articolo.getPrezzoVendita())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo del costo di: " + prezzoVendita + "€");
        }
    }

    public void ricercaPrezzoAcquisto (Double prezzoAcquisto) {

        boolean elementoPresente = false;

        for (Prodotti articolo : listaDispositivi) {
            if (Objects.equals(prezzoAcquisto, articolo.getPrezzoAcquisto())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo con un prezzo d'acquisto di: " + prezzoAcquisto + "€");
        }
    }

    public void ricercaRangePrezzo (Double min, Double max) {

        boolean elementoPresente = false;

        for (Prodotti articolo : listaDispositivi) {
            if (min <= articolo.getPrezzoVendita() && max >= articolo.getPrezzoVendita()) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo presente nel range di prezzo: " + min + " - " + max);
        }
    }
}