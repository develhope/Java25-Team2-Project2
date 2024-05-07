import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Menu menu = new Menu();
            Magazzino tipiDiProdotto = new Magazzino();
            //Carrello carrello = new Carrello();
            Scanner scanner = new Scanner(System.in);
            int scelta;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Prodotti disponibili");
            System.out.println("3 - Accesso al carrello");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    break;
                case 1:
                    System.out.println(tipiDiProdotto.disponibili());
                    break;
                case 2:
                    System.out.println("ricerca per modello");
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