public class Main {
    public static void main(String[] args) {


        Carrello carrelloEuronics = new Carrello("Carrello Euronics");
        Carrello carrelloExpert = new Carrello("Carrello Expert");
        Carrello carrelloLidl = new Carrello("Carrello Lidl");



        Magazzino magazzinoEuronics = new Magazzino("Euronics", "Via Empedocle Restivo 62", "ha al suo interno prodotti elettronici", "Palermo", carrelloEuronics);
        Magazzino magazzinoExpert = new Magazzino("Expert", "Via Del corso 5", "ha al suo interno prodotti elettronici", "Roma", carrelloExpert);
        Magazzino magazzinoLidl = new Magazzino("Lidl", "Via Dante", "ha al suo interno prodotti alimentari", "Torino", carrelloLidl);


        //Prodotti elettronici
        Prodotti smartphone1 = new Smartphone(EnumProdottiElettronici.SMARTPHONE.getDescrizione(), "Apple", "Iphone12", "Ciao", 899.99, 7.0, 128);
        Prodotti smartphone2 = new Smartphone(EnumProdottiElettronici.SMARTPHONE.getDescrizione(), "Samsung", "Galaxy A71", "è un buon telefono", 399.99, 6.4, 128);
        Prodotti smartphone3 = new Smartphone(EnumProdottiElettronici.SMARTPHONE.getDescrizione(), "LG", "Wing", "Può ruotare lo schermo", 399.99, 6.9, 256);
        Prodotti smartphone4 = new Smartphone(EnumProdottiElettronici.SMARTPHONE.getDescrizione(), "Samsung", "S23", "Uno dei migliori smartphone Samsung", 1099.99, 7.0, 512);
        Prodotti notebook1 = new Notebook(EnumProdottiElettronici.NOTEBOOK.getDescrizione(), "Intel", "Chuwi", "Ciao2", 200.00, 15.4, 500);
        Prodotti notebook2 = new Notebook(EnumProdottiElettronici.NOTEBOOK.getDescrizione(), "Acer", "Aspire", "Un normalissimo notebook", 399.99, 15.1, 1024);
        Prodotti notebook3 = new Notebook(EnumProdottiElettronici.NOTEBOOK.getDescrizione(), "MSI", "Katana", "Un notebook da Gaming", 899.99, 18.1, 1024);
        Prodotti tablet1 = new Tablet(EnumProdottiElettronici.TABLET.getDescrizione(), "Samsung", "Galaxy S7", "è bello", 200.00 , 10.1, 64);
        Prodotti tablet2 = new Tablet(EnumProdottiElettronici.TABLET.getDescrizione(), "Apple", "Ipad Air", "Tablet elegante e professionale", 649.99, 9.8, 512);
        Prodotti tablet3 = new Tablet(EnumProdottiElettronici.TABLET.getDescrizione(), "Lenovo", "Thinkpad", "Tablet economico", 149.99, 10.1, 64);

        //Prodotti alimentari
        Prodotti frutta1 = new Frutta(EnumProdottiAlimentari.FRUTTA.getDescrizione(), "Melinda", "Mela", "è una mela Smith", 0.30, true);



        magazzinoEuronics.visualizzaDettagliMagazzino();

        magazzinoEuronics.aggiungiArticoloMagazzino(smartphone1);
        magazzinoEuronics.aggiungiArticoloMagazzino(tablet1);
        magazzinoEuronics.aggiungiArticoloMagazzino(notebook1);

        magazzinoEuronics.listaArticoliMagazzino();

        magazzinoEuronics.getCarrello().aggiungiProdotto(smartphone4);
        magazzinoEuronics.getCarrello().aggiungiProdotto(notebook3);

        magazzinoEuronics.getCarrello().visualizzaCarrello();

        magazzinoEuronics.getCarrello().calcoloMediaPrezzi();

        magazzinoExpert.aggiungiArticoloMagazzino(notebook2);

        magazzinoExpert.listaArticoliMagazzino();

        magazzinoExpert.getCarrello().aggiungiProdotto(tablet3);

        magazzinoExpert.getCarrello().visualizzaCarrello();

        magazzinoLidl.aggiungiArticoloMagazzino(frutta1);

        magazzinoLidl.listaArticoliMagazzino();
    }
}