import java.util.Scanner;

public class MetodiRicerca {

    static Magazzino magazzino = new Magazzino();

    public MetodiRicerca() {
    }

    public void ricercaTipo (Scanner scanner) {
        System.out.println("Inserire tipologia dispositivo");
        Tipo tipo = Tipo.valueOf(scanner.nextLine());
        for(ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
            if (tipo == articolo.checkTipo()) {
                System.out.println(articolo);
            }
        }
        System.out.println();
    }



    public static void metodiDiRicerca() {

        Scanner scanner = new Scanner(System.in);
        String scelta;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Ricerca per Produttore");
            System.out.println("2 - Ricerca per Modello");
            System.out.println("3 - Ricerca tipo");

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
                    for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
                        if (nomeProduttore.equals(articolo.checkProduttore())) {
                            System.out.println(articolo);
                        }
                    }
                    break;
                case "2":
                    System.out.println("Inserire nome modello:");
                    Scanner scanner2 = new Scanner(System.in);
                    String nomeModello = scanner2.nextLine();
                    for (ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
                        if (nomeModello.equals(articolo.checkModello())) {
                            System.out.println(articolo);
                        }
                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Inserire tipologia dispositivo");
                    Scanner scanner3 = new Scanner(System.in);
                    Tipo tipo = Tipo.valueOf(scanner3.nextLine());
                    for(ArticoliElettronici articolo : magazzino.ritornoElencoArticoli()) {
                        if (tipo == articolo.checkTipo()) {
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