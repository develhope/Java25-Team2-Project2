import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Menu menu = new Menu();
            Magazzino magazzino = new Magazzino();
            //Carrello carrello = new Carrello();
            Scanner scanner = new Scanner(System.in);
            int scelta;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Ricerca");
            System.out.println("3 - Accesso al carrello");

            scelta = scanner.nextInt();
            System.out.println(" ");

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Dispositivi presenti nel magazzino:");
                    for (int i = 0; i < magazzino.ritornoElencoArticoli().size(); i++) {
                        System.out.println((i + 1) + ". " + magazzino.ritornoElencoArticoli().get(i));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Criterio di ricerca:");
                    System.out.println();
                    magazzino.scannerRicercaMagazzino();
                    System.out.println();
                    break;
                case 3:
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