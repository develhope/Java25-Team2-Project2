import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Carrello {

    private String nomeCarrello;
    private BigDecimal totaleCarrello;
    private ArrayList<Prodotti> articoli;


    public Carrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
        this.articoli = new ArrayList<>();
        this.totaleCarrello = BigDecimal.ZERO;
    }

    public String getNomeCarrello() {
        return nomeCarrello;
    }

    public void setNomeCarrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
    }

    public ArrayList<Prodotti> getArticoli() {
        return articoli;
    }

    public void setArticoli(ArrayList<Prodotti> articoli) {
        this.articoli = articoli;
    }

    public void aggiungiProdotto(Prodotti articolo) {
        System.out.println("\nAggiunta del prodotto al carrello in corso...\n");
        articoli.add(articolo);
        this.totaleCarrello = this.totaleCarrello.add(articolo.getPrezzo());
    }

    public void rimuoviProdotto(Prodotti articolo) {
        System.out.println("\nRimozione del prodotto dal carrello in corso...\n");
        articoli.remove(articolo);
        this.totaleCarrello = this.totaleCarrello.subtract(articolo.getPrezzo()).setScale(2,RoundingMode.HALF_UP);
    }

    private void visualizzaArticoliCarrello() {
        for (Prodotti prodotto : articoli) {
            System.out.println(prodotto.stampaDettagliProdotto());
        }
    }


    public void calcoloMediaPrezzi() {
        System.out.println("\nCalcolo media in corso...");
        if (totaleCarrello.equals(BigDecimal.ZERO)) {
            System.out.println("Il numero di articoli è zero, non è possibile calcolare la media.\n");
            return;
        }
        Integer numeroArticoli = articoli.size();
        // Calcola il prezzo medio
        BigDecimal result = this.totaleCarrello.divide(BigDecimal.valueOf(numeroArticoli), BigDecimal.ROUND_HALF_UP);

        System.out.println("Il prezzo medio di ogni articolo è di: " + result + "\n");
    }

    public void stampaDettagliCarrello () {
        System.out.println("\nCarrello: \"" + getNomeCarrello() +  "\"\nArticoli nel Carrello: \n");
        visualizzaArticoliCarrello();
        System.out.println("Totale: " + this.totaleCarrello + "\n");
    }

    public void finalizzaOperazioneVendita () {
        System.out.println("\nRiepilogo Carrello: ");
        System.out.println("Totale " + getNomeCarrello() + " = " + this.totaleCarrello + "\n");
        System.out.println("Riassunto acquisto:");
        visualizzaArticoliCarrello();
        articoli.clear();
        System.out.println("Grazie per l'acquisto.\n");
    }
}