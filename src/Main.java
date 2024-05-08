import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Menu menu = new Menu();
            Magazzino tipiDiProdotto = new Magazzino();
            Articoli articoli = new Articoli();
            MetodiRicerca metodiRicerca = new MetodiRicerca();
            Scanner scanner = new Scanner(System.in);
            int scelta;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Ricerca per modello");
            System.out.println("3 - Accesso al carrello");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    break;
                case 1:
                    for (int i = 0; i < tipiDiProdotto.disponibili().size(); i++) {
                        System.out.println((i + 1) + ". " + tipiDiProdotto.disponibili().get(i));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digitare nome modello: ");
                    metodiRicerca.ricercaModello(articoli);
                    System.out.println();
                    break;
                case 3:
                    menu.creazioneCarrello();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 0);
        scanner.close();
    }
}