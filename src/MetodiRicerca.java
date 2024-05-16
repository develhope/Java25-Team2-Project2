import java.util.Objects;

public class MetodiRicerca {

    Magazzino magazzino;

    public MetodiRicerca() {
        magazzino = new Magazzino();
    }

    public void ricercaProduttore(String nomeProduttore) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (nomeProduttore.equals(articolo.checkProduttore())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
        magazzino.ritornoElencoArticoli().clear();
    }

    public void ricercaModello(String nomeModello) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (nomeModello.equals(articolo.checkModello())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
        magazzino.ritornoElencoArticoli().clear();
    }

    public void ricercaTipoDispositivo(Tipo tipoDispositivo) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (tipoDispositivo.equals(articolo.checkTipo())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Dispositivo non trovato");
        }
        magazzino.ritornoElencoArticoli().clear();
    }

    public void ricercaPrezzoVendita (Double prezzoVendita) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (Objects.equals(prezzoVendita, articolo.checkPrezzoVendita())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo del costo di: " + prezzoVendita + "€");
        }
        magazzino.ritornoElencoArticoli().clear();
    }

    public void ricercaPrezzoAcquisto (Double prezzoAcquisto) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (Objects.equals(prezzoAcquisto, articolo.checkPrezzoAcquisto())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo con un prezzo d'acquisto di: " + prezzoAcquisto + "€");
        }
        magazzino.ritornoElencoArticoli().clear();
    }

    public void ricercaRangePrezzo (Double min, Double max) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (min <= articolo.checkPrezzoVendita() && max >= articolo.checkPrezzoVendita()) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo presente nel range di prezzo: " + min + " - " + max);
        }
        magazzino.ritornoElencoArticoli().clear();
    }
}