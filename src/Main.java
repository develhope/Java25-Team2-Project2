public class Main {
    public static void main(String[] args) {


        Carrello carrello1 = new Carrello("Carrello 1");
        Carrello carrello2 = new Carrello("Carrello 2");

        Magazzino magazzino1 = new Magazzino("Magazzino Prodotti Elettronici di Roma", "Il magazzino contiene prodotti elettronici di tipo Smartphone, Notebook e Tablet.", "Il magazzino si trova nella zona industiale di Roma ed ha una grandezza di 1000m x 1000m", "Roma, Italia", carrello1);

        Smartphone smartphone1 = new Smartphone(EnumProdottiElettronici.SMARTPHONE, "Apple", "Iphone12", 999.99, "Smartphone di fascia alta", 6.3, 128);
        Smartphone smartphone2 = new Smartphone(EnumProdottiElettronici.SMARTPHONE, "Samsung", "Galaxy A71", 399.99, "Smartphone di fascia media", 6.8, 128);
        Smartphone smartphone3 = new Smartphone(EnumProdottiElettronici.SMARTPHONE, "LG", "Wing", 524.99, "Può ruotare lo schermo", 6.8, 256);
        Smartphone smartphone4 = new Smartphone(EnumProdottiElettronici.SMARTPHONE, "Samsung", "S23", 1499.99, "Uno dei migliori smartphone Samsung", 7.8, 512);
        Notebook notebook1 = new Notebook(EnumProdottiElettronici.NOTEBOOK, "Intel", "Chuwi", 269.99, "Un notebook entry-level", 15.1, 500);
        Notebook notebook2 = new Notebook(EnumProdottiElettronici.NOTEBOOK, "Acer", "Aspire", 449.99, "Un notebook ottimo per lavorare", 17.2, 1024);
        Notebook notebook3 = new Notebook(EnumProdottiElettronici.NOTEBOOK, "MSI", "Katana",  999.99, "Un notebook da Gaming", 18.1, 1024);
        Tablet tablet1 = new Tablet(EnumProdottiElettronici.TABLET, "Samsung", "Galaxy S7", 249.99, "Tablet di fascia media" , 10.1, 128);
        Tablet tablet2 = new Tablet(EnumProdottiElettronici.TABLET, "Apple", "Ipad Air", 719.99, "Tablet di fascia alta", 9.8, 512);
        Tablet tablet3 = new Tablet(EnumProdottiElettronici.TABLET, "Lenovo", "Thinkpad", 199.99, "Tablet di fascia bassa", 10.1, 64);

        carrello1.aggiungiProdotto(notebook1);
        carrello1.aggiungiProdotto(notebook2);

        carrello1.stampaDettagliCarrello();

        carrello2.aggiungiProdotto(notebook3);
        carrello2.aggiungiProdotto(notebook3);

        carrello1.rimuoviProdotto(notebook2);

        carrello1.calcoloMediaPrezzi();

        magazzino1.visualizzaDettagliMagazzino();

        magazzino1.listaArticoliCarrello();

        magazzino1.setCarrello(carrello2);
        magazzino1.listaArticoliCarrello();
        carrello1.stampaDettagliCarrello();
        carrello2.stampaDettagliCarrello();
    }
}