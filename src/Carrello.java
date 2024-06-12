import java.util.ArrayList;

public class Carrello {

    public String nomeCarrello;
    public Double totaleCarrello = 0.0;
    public ArrayList<Prodotti> articoli;

    //todo inserire come field totale carrello, nome carrello, lista prodotti.
    public Carrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
        this.articoli = new ArrayList<>();
    }

    public String getNomeCarrello() {
        return nomeCarrello;
    }

    public void setNomeCarrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
    }

    public ArrayList<Prodotti> aggiungiProdotto(Prodotti articolo) {
        articoli.add(articolo);
        totaleCarrello += articolo.getPrezzoVendita();
        visualizzaCarrello();
        System.out.println("Totale: " + totaleCarrello);
        return articoli;
    }

    public ArrayList<Prodotti> rimuoviProdotto(Prodotti articolo) {
        for (int i = 0; i < articoli.size(); i++) {
            if (articoli.contains(articolo)) {
                articoli.remove(articolo);
                totaleCarrello -= articolo.getPrezzoVendita();
                visualizzaCarrello();
                System.out.println("Totale: " + totaleCarrello);
                return articoli;
            }
        }
        System.out.println("Articolo non presente nel carrello.");
        return articoli;
    }

    //todo Sostituire il System.out.Println di articolo con il metodo stampaDettagli nella classe Prodotti.
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

    public void calcoloMediaPrezzi() {
        Double sum = 0.0;
        System.out.print("\nIl prezzo medio di ogni articolo è di: ");
        for (Prodotti articolo : articoli) {
            sum += articolo.getPrezzoVendita();
        }
        Double result = sum / articoli.size();
        System.out.println(result);
    }

    public void finalizzaOperazioneVendita() {
        //todo eliminare
        if (articoli.isEmpty()) {
            System.out.println("\nIl carrello è vuoto.");
        } else {
            visualizzaCarrello();
            System.out.println("\nTotale: " + totaleCarrello + "€");
            articoli.clear();
            System.out.println("Grazie per l'acquisto.");
        }
    }
}