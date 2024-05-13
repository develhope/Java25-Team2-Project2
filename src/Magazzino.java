import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

    public Magazzino() {
    }

    public List<ArticoliElettronici> ritornoElencoArticoli() {

        Smartphone smartphone1 = new Smartphone(Tipo.Smartphone, "Apple", "Iphone12", "Ciao", 7.0, 128, 899.99, 999.99, 827451719);
        Smartphone smartphone2 = new Smartphone(Tipo.Smartphone, "Samsung", "Galaxy A71", "è un buon telefono", 6.3, 128, 399.99, 499.99, 65736593);
        Notebook notebook1 = new Notebook(Tipo.Notebook, "Intel", "Chuwi", "Ciao2", 15.4, 500, 200.00, 269.99, 2333242);
        Tablet tablet1 = new Tablet(Tipo.Tablet, "Samsung", "Galaxy S7", "è bello", 10.1, 64, 200.00 , 249.99, 65307503);

        List<ArticoliElettronici> listaDispositivi = new ArrayList<>();
        listaDispositivi.add(smartphone1);
        listaDispositivi.add(smartphone2);
        listaDispositivi.add(notebook1);
        listaDispositivi.add(tablet1);

        return listaDispositivi;
    }

    public void scannerRicercaMagazzino() {

        Magazzino magazzino = new Magazzino();
        MetodiRicerca metodiRicerca = new MetodiRicerca();
        Scanner scanner = new Scanner(System.in);
        String scelta;

        do {
            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Ricerca per Tipo di Dispositivo");
            System.out.println("2 - Ricerca per Modello");

            scelta = scanner.nextLine();
            System.out.println(" ");

            switch (scelta) {
                case "0":
                    System.out.println("Uscita in corso");
                    System.out.println();
                    break;
                case "1":
                    System.out.println("Inserire Tipo di Dispositivo");
                    String tipoDispositivo = scanner.nextLine();
                    metodiRicerca.ricercaTipoDispositivo(tipoDispositivo);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Inserire nome modello:");
                    String nomeModello = scanner.nextLine();
                    metodiRicerca.ricercaModello(nomeModello);
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != "0");
        scanner.close();
    }
}