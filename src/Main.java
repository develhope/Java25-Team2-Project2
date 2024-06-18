public class Main {
    public static void main(String[] args) {

        Carrello carrello1 = new Carrello("Carrello 1");
        Magazzino magazzino = new Magazzino("Euronics","è grande", "Contiene articoli elettronici", "Palermo");

        Smartphone smartphone1 = new Smartphone("Smartphone", "Apple", "Iphone12", "Ciao", 899.99, 999.99, 827451719, 7.0, 128);
        Smartphone smartphone2 = new Smartphone("Smartphone", "Samsung", "Galaxy A71", "è un buon telefono", 399.99, 499.99, 65736593, 6.3, 128);
        Smartphone smartphone3 = new Smartphone("Smartphone", "LG", "Wing", "Può ruotare lo schermo", 399.99, 524.99, 78507, 6.8, 256);
        Smartphone smartphone4 = new Smartphone("Smartphone", "Samsung", "S23", "Uno dei migliori smartphone Samsung", 1099.99, 1499.99, 7530287, 7.0, 512);
        Notebook notebook1 = new Notebook("Notebook", "Intel", "Chuwi", "Ciao2", 200.00, 269.99, 2333242, 15.4, 500);
        Notebook notebook2 = new Notebook("Notebook", "Acer", "Aspire", "Un normalissimo notebook", 399.99, 449.99, 780345, 15.1, 1024);
        Notebook notebook3 = new Notebook("Notebook", "MSI", "Katana", "Un notebook da Gaming", 899.99, 999.99, 24528, 18.1, 1024);
        Tablet tablet1 = new Tablet("Tablet", "Samsung", "Galaxy S7", "è bello", 200.00 , 249.99, 65307503, 10.1, 64);
        Tablet tablet2 = new Tablet("Tablet", "Apple", "Ipad Air", "Tablet elegante e professionale", 649.99, 719.99, 93784, 9.8, 512);
        Tablet tablet3 = new Tablet("Tablet", "Lenovo", "Thinkpad", "Tablet economico", 149.99, 199.99, 5672893, 10.1, 64);

        carrello1.aggiungiProdotto(smartphone1);
        carrello1.aggiungiProdotto(smartphone2);

        carrello1.rimuoviProdotto(smartphone2);

        carrello1.calcoloMediaPrezzi();

        carrello1.visualizzaCarrello();
    }
}