import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int scelta;

        do {
            System.out.println("Selezionare operazione:");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Prodotti disponibili");
            System.out.println("4 - Uscita");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Accesso al magazzino" + "\n");
                    Magazzino tipiDiProdotto = new Magazzino();
                    tipiDiProdotto.disponibili();
                    break;
                case 2:
                    System.out.println("Prodotti da visualizzare");
                    break;
                case 3:
                    System.out.println("Fai una cosa");
                    break;
                case 4:
                    System.out.println("Uscita in corso");
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 4);
        scanner.close();
    }
}