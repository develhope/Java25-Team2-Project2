import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selezionare operazione:");
        System.out.println("1 - Accesso al magazzino");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Accesso al magazzino" + "\n");
                Magazzino artDisp = new Magazzino();
                artDisp.disponibili();
                break;
            case 2:
                System.out.println("Accesso al carrello");
                break;
            case 3:
                System.out.println("Fai qualcosa");
                break;
            case 4:
                System.out.println("Fai un'altra cosa");
                break;
            default:
                System.out.println("Scelta non valida");
        }

        scanner.close();
    }
}