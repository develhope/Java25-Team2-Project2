import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Menu menu = new Menu();
            Magazzino tipiDiProdotto = new Magazzino();
            Scanner scanner = new Scanner(System.in);
            int scelta;

            //Con questo ciclo do/while ripetiamo questo blocco di codice fintanto che non diamo come input "0"
            // o finchè non passiamo ad un altro ciclo do/while.

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Esci");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Ricerca");
            System.out.println("3 - Accesso al carrello");

            scelta = scanner.nextInt();
            System.out.println();

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                case 1:
                    System.out.println("Dispositivi presenti nel magazzino:");
                    for (int i = 0; i < tipiDiProdotto.disponibili().size(); i++) {
                        System.out.println((i + 1) + ". " + tipiDiProdotto.disponibili().get(i));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Criterio di ricerca:");
                    System.out.println();
                    MetodiRicerca.metodiDiRicerca();
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