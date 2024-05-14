import java.util.Objects;

public class MetodiRicerca {

    static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public void ricercaProduttore(String nomeProduttore) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (nomeProduttore.equals(articolo.checkModello())) {
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

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (nomeModello.equals(articolo.checkModello())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
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
    }
}