import java.util.ArrayList;
import java.util.List;

public class Magazzino {

    public Magazzino() {
    }

    public List<Articoli> disponibili() {

        Smartphone smartphone1 = new Smartphone(Tipo.Smartphone, "Apple", "Iphone12", "Ciao", "7''", "128GB", "899€", 999.99, "8274517193");
        Smartphone smartphone2 = new Smartphone(Tipo.Smartphone, "Samsung", "Galaxy A71", "è un buon telefono", "7''", "128GB", "399€", 499.99, "65736593");
        Notebook notebook1 = new Notebook(Tipo.Notebook, "Intel", "Chuwi", "Ciao2", "128", "150gb", "200€", 269.99, "2333242");
        Tablet tablet1 = new Tablet(Tipo.Tablet, "Samsung", "Galaxy S7", "è bello", "10.1", "64GB", "200€", 249.99, "65307503");

        List<Articoli> listaDispositivi = new ArrayList<>();
        listaDispositivi.add(smartphone1);
        listaDispositivi.add(smartphone2);
        listaDispositivi.add(tablet1);
        listaDispositivi.add(notebook1);

        return listaDispositivi;
    }
}