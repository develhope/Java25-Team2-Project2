import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

    public Magazzino() {
    }

    List<ArticoliElettronici> listaDispositivi = new ArrayList<>();

    public List<ArticoliElettronici> ritornoElencoArticoli() {

        Smartphone smartphone1 = new Smartphone(Tipo.Smartphone, "Apple", "Iphone12", "Ciao", 7.0, 128, 899.99, 999.99, 827451719);
        Smartphone smartphone2 = new Smartphone(Tipo.Smartphone, "Samsung", "Galaxy A71", "è un buon telefono", 6.3, 128, 399.99, 499.99, 65736593);
        Notebook notebook1 = new Notebook(Tipo.Notebook, "Intel", "Chuwi", "Ciao2", 15.4, 500, 200.00, 269.99, 2333242);
        Tablet tablet1 = new Tablet(Tipo.Tablet, "Samsung", "Galaxy S7", "è bello", 10.1, 64, 200.00 , 249.99, 65307503);


        listaDispositivi.add(smartphone1);
        listaDispositivi.add(smartphone2);
        listaDispositivi.add(notebook1);
        listaDispositivi.add(tablet1);

        return listaDispositivi;
    }

    public List<ArticoliElettronici> aggiungiSmartphone(List<ArticoliElettronici> listaDispositivi) {

        Scanner scanner = new Scanner(System.in);

        Tipo tipo = Tipo.Smartphone;
        System.out.println("Inserire nome produttore:");
        String produttore = scanner.nextLine();
        System.out.println("Inserire nome modello:");
        String modello = scanner.nextLine();
        System.out.println("Inserire descrizione dispositivo:");
        String descrizione = scanner.nextLine();
        System.out.println("Inserire dimensione display:");
        Double dimensioneDisplay = scanner.nextDouble();
        System.out.println("Inserire spazio archiviazione:");
        Integer spazioArchiviazione = scanner.nextInt();
        System.out.println("Inserire prezzo d'acquisto:");
        Double prezzoAcquisto = scanner.nextDouble();
        System.out.println("Inserire prezzo di vendita:");
        Double prezzoVendita = scanner.nextDouble();
        System.out.println("Inserire ID dispositivo");
        Integer idDispositivo = scanner.nextInt();

        ArticoliElettronici nuovoSmartphone = new Smartphone(tipo, produttore, modello, descrizione, dimensioneDisplay, spazioArchiviazione, prezzoAcquisto, prezzoVendita, idDispositivo);

        listaDispositivi.add(nuovoSmartphone);

        return listaDispositivi;
    }

    public List<ArticoliElettronici> aggiungiTablet(List<ArticoliElettronici> listaDispositivi) {

        Scanner scanner = new Scanner(System.in);

        Tipo tipo = Tipo.Tablet;
        System.out.println("Inserire nome produttore:");
        String produttore = scanner.nextLine();
        System.out.println("Inserire nome modello:");
        String modello = scanner.nextLine();
        System.out.println("Inserire descrizione dispositivo:");
        String descrizione = scanner.nextLine();
        System.out.println("Inserire dimensione display:");
        Double dimensioneDisplay = scanner.nextDouble();
        System.out.println("Inserire spazio archiviazione:");
        Integer spazioArchiviazione = scanner.nextInt();
        System.out.println("Inserire prezzo d'acquisto:");
        Double prezzoAcquisto = scanner.nextDouble();
        System.out.println("Inserire prezzo di vendita:");
        Double prezzoVendita = scanner.nextDouble();
        System.out.println("Inserire ID dispositivo");
        Integer idDispositivo = scanner.nextInt();

        ArticoliElettronici nuovoTablet = new Tablet(tipo, produttore, modello, descrizione, dimensioneDisplay, spazioArchiviazione, prezzoAcquisto, prezzoVendita, idDispositivo);

        listaDispositivi.add(nuovoTablet);

        return listaDispositivi;
    }

    public List<ArticoliElettronici> aggiungiNotebook(List<ArticoliElettronici> listaDispositivi) {

        Scanner scanner = new Scanner(System.in);

        Tipo tipo = Tipo.Notebook;
        System.out.println("Inserire nome produttore:");
        String produttore = scanner.nextLine();
        System.out.println("Inserire nome modello:");
        String modello = scanner.nextLine();
        System.out.println("Inserire descrizione dispositivo:");
        String descrizione = scanner.nextLine();
        System.out.println("Inserire dimensione display:");
        Double dimensioneDisplay = scanner.nextDouble();
        System.out.println("Inserire spazio archiviazione:");
        Integer spazioArchiviazione = scanner.nextInt();
        System.out.println("Inserire prezzo d'acquisto:");
        Double prezzoAcquisto = scanner.nextDouble();
        System.out.println("Inserire prezzo di vendita:");
        Double prezzoVendita = scanner.nextDouble();
        System.out.println("Inserire ID dispositivo");
        Integer idDispositivo = scanner.nextInt();

        ArticoliElettronici nuovoNotebook = new Notebook(tipo, produttore, modello, descrizione, dimensioneDisplay, spazioArchiviazione, prezzoAcquisto, prezzoVendita, idDispositivo);

        listaDispositivi.add(nuovoNotebook);

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
                    metodiRicerca.ricercaTipoDispositivo(Tipo.valueOf(tipoDispositivo));
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