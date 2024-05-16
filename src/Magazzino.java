import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazzino {

    ArrayList<ArticoliElettronici> listaDispositivi;
    Scanner scanner;

    public Magazzino() {
        listaDispositivi = new ArrayList<>();
        scanner = new Scanner(System.in);

        Smartphone smartphone1 = new Smartphone(Tipo.Smartphone, "Apple", "Iphone12", "Ciao", 7.0, 128, 899.99, 999.99, 827451719);
        Smartphone smartphone2 = new Smartphone(Tipo.Smartphone, "Samsung", "Galaxy A71", "è un buon telefono", 6.3, 128, 399.99, 499.99, 65736593);
        Smartphone smartphone3 = new Smartphone(Tipo.Smartphone, "LG", "Wing", "Può ruotare lo schermo", 6.8, 256, 399.99, 524.99, 78507);
        Smartphone smartphone4 = new Smartphone(Tipo.Smartphone, "Samsung", "S23", "Uno dei migliori smartphone Samsung", 7.0, 512, 1099.99, 1499.99, 7530287);
        Notebook notebook1 = new Notebook(Tipo.Notebook, "Intel", "Chuwi", "Ciao2", 15.4, 500, 200.00, 269.99, 2333242);
        Notebook notebook2 = new Notebook(Tipo.Notebook, "Acer", "Aspire", "Un normalissimo notebook", 15.1, 1024, 399.99, 449.99, 780345);
        Notebook notebook3 = new Notebook(Tipo.Notebook, "MSI", "Katana", "Un notebook da Gaming", 18.1, 1024, 899.99, 999.99, 24528);
        Tablet tablet1 = new Tablet(Tipo.Tablet, "Samsung", "Galaxy S7", "è bello", 10.1, 64, 200.00 , 249.99, 65307503);
        Tablet tablet2 = new Tablet(Tipo.Tablet, "Apple", "Ipad Air", "Tablet elegante e professionale", 9.8, 512, 649.99, 719.99, 93784);
        Tablet tablet3 = new Tablet(Tipo.Tablet, "Lenovo", "Thinkpad", "Tablet economico", 10.1, 64, 149.99, 199.99, 5672893);

        listaDispositivi.add(smartphone1);
        listaDispositivi.add(smartphone2);
        listaDispositivi.add(smartphone3);
        listaDispositivi.add(smartphone4);
        listaDispositivi.add(notebook1);
        listaDispositivi.add(notebook2);
        listaDispositivi.add(notebook3);
        listaDispositivi.add(tablet1);
        listaDispositivi.add(tablet2);
        listaDispositivi.add(tablet3);
    }

    public List<ArticoliElettronici> aggiungiSmartphone() {

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

    public List<ArticoliElettronici> aggiungiTablet() {

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

    public List<ArticoliElettronici> aggiungiNotebook() {

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

    public List<ArticoliElettronici> getListaDispositivi() {
        return listaDispositivi;
    }
}