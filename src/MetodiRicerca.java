public class MetodiRicerca {

    static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public void ricercaModello(String nomeModello) {

        boolean elementoPresente = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (nomeModello.equals(articolo.checkModello())) {
                elementoPresente = true;
                System.out.println(articolo);
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    public void ricercaTipoDispositivo(String tipoDispositivo) {

        boolean trovatoTipo = false;

        for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (String.valueOf(articolo.checkTipo()).equals(tipoDispositivo)) {
                System.out.println(articolo);
                trovatoTipo = true;
            }
        }

        if (!trovatoTipo) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }
}
