import java.util.Objects;

public abstract class Prodotti implements InterfacciaProdotti {

    private String tipo;
    private String produttore;
    private String descrizione;
    private Double prezzo;
    private Carrello carrello;

    public Prodotti(String tipo, String produttore, String descrizione, Double prezzo) {
        this.tipo = tipo;
        this.produttore = produttore;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void stampaDettagli() {
        System.out.println("Tipo di prodotto: " + this.tipo + " Produttore: " + this.produttore + " Descrizione: " + this.descrizione + " Prezzo: " + this.prezzo);
    }

    @Override
    public void ricercaTipoDispositivo(String tipoDispositivo, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.getArticoli()) {
            if (tipoDispositivo.equals(articolo.getTipo())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }


    @Override
    public void ricercaProduttore(String nomeProduttore, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.getArticoli()) {
            if (nomeProduttore.equals(articolo.getProduttore())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    @Override
    public void ricercaPrezzo(Double prezzo, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.getArticoli()) {
            if (Objects.equals(prezzo, articolo.getPrezzo())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo del costo di: " + prezzo + "€");
        }
    }


    @Override
    public void ricercaRangePrezzo(Double min, Double max, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.getArticoli()) {
            if (min <= articolo.getPrezzo() && max >= articolo.getPrezzo()) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo presente nel range di prezzo: " + min + " - " + max);
        }
    }
}


