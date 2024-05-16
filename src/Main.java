import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Magazzino magazzino = new Magazzino();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        //Con questo ciclo do/while ripetiamo questo blocco di codice fintanto che non diamo come input "0"
        // o finchè non passiamo ad un altro ciclo do/while.

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Aggiungi articolo al magazzino");
            System.out.println("3 - Ricerca");
            System.out.println("4 - Accesso al carrello");

            scelta = scanner.nextInt();
            System.out.println(" ");

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Dispositivi presenti nel magazzino:");
                    for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
                        System.out.println(articolo);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Cosa vuoi aggiungere?");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Notebook");
                    System.out.println("3. Tablet");
                    Integer sceltaTipo = scanner.nextInt();
                    System.out.println();
                    if (sceltaTipo == 1) {
                        for (ArticoliElettronici articolo : magazzino.aggiungiSmartphone()) {
                            System.out.println(articolo);
                        }
                    } else if (sceltaTipo == 2) {
                        for (ArticoliElettronici articolo : magazzino.aggiungiNotebook()) {
                            System.out.println(articolo);
                        }
                    } else if (sceltaTipo == 3) {
                        for (ArticoliElettronici articolo : magazzino.aggiungiTablet()) {
                            System.out.println(articolo);
                        }
                    } else if (sceltaTipo < 1 || sceltaTipo > 3) {
                        System.out.println("scelta non valida");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Criterio di ricerca:");
                    System.out.println();
                    menu.ricercaDispositivi();
                    System.out.println();
                    break;
                case 4:
                    menu.creazioneCarrello();
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 0);
        scanner.close();
    }
}
