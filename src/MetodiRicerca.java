import java.util.Scanner;

public class MetodiRicerca {

     static Articoli articoli = new Articoli();
     static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public static void metodiDiRicerca() {

        Scanner scanner = new Scanner(System.in);
        String scelta;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Ricerca per Modello");

            scelta = scanner.nextLine();
            System.out.println(" ");

            switch (scelta) {
                case "0":
                    System.out.println("Uscita in corso");
                    System.out.println();
                    break;
                case "1":
                    System.out.println("Inserire nome modello:");
                    String nomeModello = scanner.nextLine();
                    for(Articoli articolo : magazzino.disponibili()) {
                        if (nomeModello.equals(articolo.getModello())) {
                            System.out.println(articolo);
                        }
                }
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != "0") ;
            scanner.close();

    }

    public static String ricercaModello(String x) {
        if (x.equals(articoli.getModello()));
        return x;
    }
}
