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

        boolean trovatoTipo = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (tipoDispositivo.equals(articolo.checkTipo())) {
                System.out.println(articolo);
                trovatoTipo = true;
            }
        }

        if (!trovatoTipo) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }
}