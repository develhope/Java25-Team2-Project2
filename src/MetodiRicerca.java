import java.util.Scanner;

public class MetodiRicerca {

    static Articoli articoli = new Articoli();
    static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public void ricercaModello(String nomeModello) {
        for (Articoli articolo : magazzino.disponibili()) {
            if (nomeModello.equals(articolo.getModello())) {
                System.out.println(articolo);
            } else {
                System.out.println("Errore: Modello non trovato");
                break;
            }
        }
    }

    public void ricercaTipoDispositivo(Tipo tipoDispositivo) {

        for (Articoli articolo : magazzino.disponibili()) {
            switch (tipoDispositivo) {
                case Smartphone:
                    if (articolo.getTipo().equals(tipoDispositivo)) {
                    System.out.println(articolo);
                    }
                    break;
                case Notebook:
                    if (articolo.getTipo().equals(tipoDispositivo)) {
                        System.out.println(articolo);
                    }
                    break;
                case Tablet:
                    if (articolo.getTipo().equals(tipoDispositivo)) {
                        System.out.println(articolo);
                    }
                    break;
                default:
                    if (articolo.getTipo().equals(tipoDispositivo)) {
                        System.out.println("Errore: Dispositivo non trovato");
                    }
                    break;
            }
        }
    }
}
