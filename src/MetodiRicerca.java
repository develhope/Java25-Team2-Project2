import java.util.Scanner;

public class MetodiRicerca {

    static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public static void metodiDiRicerca() {

        Scanner scanner = new Scanner(System.in);
        String scelta;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Ricerca per Produttore");
            System.out.println("2 - Ricerca per Modello");

            scelta = scanner.nextLine();
            System.out.println(" ");

            switch (scelta) {
                case "0":
                    System.out.println("Uscita in corso");
                    System.out.println();
                    break;
                case "1":
                    System.out.println("Inserire nome produttore");
                    Scanner scanner1 = new Scanner(System.in);
                    String nomeProduttore = scanner1.nextLine();
                    for (ArticoliElettronici articolo : magazzino.disponibili()) {
                        if (nomeProduttore.equals(articolo.checkProduttore())) {
                            System.out.println(articolo);
                        }
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Inserire nome modello:");
                    Scanner scanner2 = new Scanner(System.in);
                    String nomeModello = scanner2.nextLine();
                    for (ArticoliElettronici articolo : magazzino.disponibili()) {
                        if (nomeModello.equals(articolo.checkModello())) {
                            System.out.println(articolo);
                        }
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (!scelta.equals("0"));
    }
}