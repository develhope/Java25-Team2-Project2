public class MetodiRicerca {

    static Articoli articoli = new Articoli();
    static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public void ricercaModello(String nomeModello) {

        boolean elementoPresente = false;

        for (Articoli articolo : magazzino.disponibili()) {
            if (nomeModello.equals(articolo.getModello())) {
                elementoPresente = true;
                System.out.println(articolo);
            } else {
                elementoPresente = false;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    public void ricercaTipoDispositivo(String tipoDispositivo) {

        boolean trovatoTipo = false;

        for (Articoli articolo : magazzino.disponibili()) {
            if (String.valueOf(articolo.getTipo()).equals(tipoDispositivo)) {
                System.out.println(articolo);
                trovatoTipo = true;
            }
        }

        if (!trovatoTipo) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }
}
