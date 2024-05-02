import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

    public Magazzino() {
    }

    public ArticoliElettronici disponibili() {
        Smartphone smartphone1 = new Smartphone("Smartphone", "Apple", "Iphone12", "Ciao", "7''", "128GB", "899€", "999€", "8274517193");
        Notebook notebook1 = new Notebook("Notebook", "Intel", "Chuwi", "Ciao2", "128", "150gb", "200€", "269€", "2333242");
        Tablet tablet1 = new Tablet("Galaxy Tab 9", "Samsung", "200.0", "350.0", "10", "9 pollici", "64 GB", "1", "\n" + "Il Galaxy Tab 9 è un tablet prodotto da Samsung. Ha un display grande e nitido da 9 pollici, perfetto per guardare video," + " navigare su Internet e lavorare su documenti.");

        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("Selezionare i prodotti da visualizzare:");
            System.out.println("1 - Smartphones");
            System.out.println("2 - Tablets");
            System.out.println("3 - Notebooks");
            System.out.println("4 - Uscita dal magazzino");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    List<Smartphone> smartphones = new ArrayList<>();
                    smartphones.add(smartphone1);
                    System.out.println(smartphones);
                    break;
                case 2:
                    List<Tablet> tablets = new ArrayList<>();
                    tablets.add(tablet1);
                    System.out.println(tablets);
                    break;
                case 3:
                    List<Notebook> notebooks = new ArrayList<>();
                    notebooks.add(notebook1);
                    System.out.println(notebooks);
                    break;
                case 4:
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 4);
        return null;
    }
}