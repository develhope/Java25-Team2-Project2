import java.util.Objects;

public class MetodiRicerca {

    Magazzino magazzino;

    public MetodiRicerca() {
        magazzino = new Magazzino();
    }

    public void ricercaProduttore(String nomeProduttore) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
            if (nomeProduttore.equals(articolo.checkProduttore())) {
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

        for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
            if (nomeModello.equals(articolo.checkModello())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
        magazzino.listaDispositivi.clear();
    }

    public void ricercaTipoDispositivo(Tipo tipoDispositivo) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
            if (tipoDispositivo.equals(articolo.checkTipo())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Dispositivo non trovato");
        }

    }

    public void ricercaPrezzoVendita (Double prezzoVendita) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
            if (Objects.equals(prezzoVendita, articolo.checkPrezzoVendita())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo del costo di: " + prezzoVendita + "€");
        }
        magazzino.listaDispositivi.clear();
    }

    public void ricercaPrezzoAcquisto (Double prezzoAcquisto) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
            if (Objects.equals(prezzoAcquisto, articolo.checkPrezzoAcquisto())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo con un prezzo d'acquisto di: " + prezzoAcquisto + "€");
        }
        magazzino.listaDispositivi.clear();
    }

    public void ricercaRangePrezzo (Double min, Double max) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
            if (min <= articolo.checkPrezzoVendita() && max >= articolo.checkPrezzoVendita()) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo presente nel range di prezzo: " + min + " - " + max);
        }
        magazzino.listaDispositivi.clear();
    }
}