// Definizione dei Tablet

public class Tablet {
    private String modello;
    private String marca;
    private double prezzoAcquisto;
    private double prezzoVendita;
    private double prezzoAcquistoIVA;
    private double prezzoVenditaIVA;
    private int quantitaDisponibile;
    private String dimensioneDisplay;
    private String spazioArchiviazione;
    private int id;
    private String descrizione;

    // Costruttori
    public Tablet() {
        this.modello = "Selezionabile";
        this.marca = "Selezionabile";
        this.prezzoAcquisto = 0.0;
        this.prezzoVendita = 0.0;
        this.prezzoAcquistoIVA = 0.0;
        this.prezzoVenditaIVA = 0.0;
        this.quantitaDisponibile = 0;
        this.dimensioneDisplay = "indefinito";
        this.spazioArchiviazione = "indefinito";
        this.id = -1;
        this.descrizione = "";
    }

    public Tablet(String modello, String marca, double prezzoAcquisto, double prezzoVendita, int quantitaDisponibile,
                  String dimensioneDisplay, String spazioArchiviazione, int id, String descrizione) {
        this.modello = modello;
        this.marca = marca;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.prezzoAcquistoIVA = prezzoAcquisto * 1.22; // 22% di IVA
        this.prezzoVenditaIVA = prezzoVendita * 1.22; // 22% di IVA
        this.quantitaDisponibile = quantitaDisponibile;
        this.dimensioneDisplay = dimensioneDisplay;
        this.spazioArchiviazione = spazioArchiviazione;
        this.id = id;
        this.descrizione = descrizione;
    }

    // Getter e Setter
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public double getPrezzoAcquistoIVA() {
        return prezzoAcquistoIVA;
    }

    public double getPrezzoVenditaIVA() {
        return prezzoVenditaIVA;
    }

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(String dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public String getSpazioArchiviazione() {
        return spazioArchiviazione;
    }

    public void setSpazioArchiviazione(String spazioArchiviazione) {
        this.spazioArchiviazione = spazioArchiviazione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    // Varie stampe del caso
    public void stampaInfo() {
        System.out.println("Modello: " + modello);
        System.out.println("Marca: " + marca);
        System.out.println("Prezzo di acquisto (IVA inclusa): " + prezzoAcquistoIVA + " euro");
        System.out.println("Prezzo di vendita (IVA inclusa): " + prezzoVenditaIVA + " euro");
        System.out.println("Quantità disponibile: " + quantitaDisponibile);
        System.out.println("Dimensione display: " + dimensioneDisplay);
        System.out.println("Spazio di archiviazione: " + spazioArchiviazione);
        System.out.println("ID: " + id);
        System.out.println("Descrizione: " + descrizione);
    }

    public void vendiTablet(int quantitaVenduta) {
        if (quantitaVenduta <= quantitaDisponibile) {
            quantitaDisponibile -= quantitaVenduta;
            System.out.println("Vendita effettuata. Modelli rimanenti: " + quantitaDisponibile);
        } else {
            System.out.println("Modello non disponibile.");
        }
    }
}
