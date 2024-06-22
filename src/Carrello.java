import java.util.ArrayList;

public class Carrello {

    public String nomeCarrello;
    public Double totaleCarrello = 0.0;
    public ArrayList<Prodotti> articoli;

    public Carrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
        this.articoli = new ArrayList<>();
        this.totaleCarrello = 0.0;
    }

    public String getNomeCarrello() {
        return nomeCarrello;
    }

    public void setNomeCarrello(String nomeCarrello) {
        this.nomeCarrello = nomeCarrello;
    }

    public void aggiungiProdotto(Prodotti articolo) {
        articoli.add(articolo);
    }

    public void rimuoviProdotto(Prodotti articolo) {
        articoli.remove(articolo);
    }

    public void visualizzaCarrello() {
        for (Prodotti articolo : this.articoli)
        System.out.println(articolo);
    }


    public void calcoloMediaPrezzi() {
        Double totaleCarrello = 0.0;
        System.out.print("\nIl prezzo medio di ogni articolo è di: ");
        for (Prodotti articolo : articoli) {
            totaleCarrello += articolo.getPrezzoVendita();
        }
        Double result = totaleCarrello / articoli.size();
        System.out.println(result);
    }

}