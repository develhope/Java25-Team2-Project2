public class Main {

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Smartphone", "Apple", "Iphone12", " ", "7''", "128GB", "899€", "999€", "8274517193");
         Notebook notebook1 = new Notebook("Notebook", "Intel", "Chuwi", "", "128", "150gb", "200€", "269€", "2333242");
        Tablet tablet1 = new Tablet(
                "Galaxy Tab 9",
                "Samsung",
                200.0,
                350.0,
                10,
                "9 pollici",
                "64 GB",
                1,
                "\n" +
                        "Il Galaxy Tab 9 è un tablet prodotto da Samsung. Ha un display grande e nitido da 9 pollici, perfetto per guardare video," +
                        " navigare su Internet e lavorare su documenti.");
        System.out.println(smartphone1);
        System.out.println(notebook1);
       
        // Informazioni tablet
        tablet1.stampaInfo();
        // Tablet venduti
        tablet1.vendiTablet(1);
    }
}
