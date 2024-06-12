import java.util.Objects;

public abstract class Prodotti {

    //todo lasciare solo un prezzo, descrizione, tipoProdotto, modello?, facciamo l'enum per tipo.
    private String tipo;
    private String produttore;
    private String modello;
    private String descrizioneDispositivo;
    private Double prezzoAcquisto;
    private Double prezzoVendita;
    private Integer idProdotto;

    public Prodotti(String tipo, String produttore, String modello, String descrizioneDispositivo, Double prezzoAcquisto, Double prezzoVendita, Integer idProdotto) {
        this.tipo = tipo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizioneDispositivo = descrizioneDispositivo;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.idProdotto = idProdotto;
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

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getDescrizioneDispositivo() {
        return descrizioneDispositivo;
    }

    public void setDescrizioneDispositivo(String descrizioneDispositivo) {
        this.descrizioneDispositivo = descrizioneDispositivo;
    }

    public Double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(Double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public Double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(Double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public Integer getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(Integer idProdotto) {
        this.idProdotto = idProdotto;
    }

    //todo metodo per stampare i dettagli.


    /*public void ricercaTipoDispositivo(String tipoDispositivo, String nomeCarrello) {

        Carrello carrello = new Carrello(nomeCarrello);
        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.articoli) {
            if (tipoDispositivo.equals(articolo.getTipo())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }


    public void ricercaProduttore(String nomeProduttore, String nomeCarrello) {

        Carrello carrello = new Carrello(nomeCarrello);
        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.articoli) {
            if (nomeProduttore.equals(articolo.getProduttore())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }


    public void ricercaModello(String nomeModello, String nomeCarrello) {

        Carrello carrello = new Carrello(nomeCarrello);
        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.articoli) {
            if (nomeModello.equals(articolo.getModello())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }


    public void ricercaPrezzo (Double prezzo, String nomeCarrello) {

        Carrello carrello = new Carrello(nomeCarrello);
        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.articoli) {
            if (Objects.equals(prezzo, articolo.getPrezzoVendita())) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo del costo di: " + prezzo + "€");
        }
    }


    public void ricercaRangePrezzo (Double min, Double max, String nomeCarrello) {

        Carrello carrello = new Carrello(nomeCarrello);
        boolean elementoPresente = false;

        for (Prodotti articolo : carrello.articoli) {
            if (min <= articolo.getPrezzoVendita() && max >= articolo.getPrezzoVendita()) {
                System.out.println(articolo);
                elementoPresente = true;
            }
        }

        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo presente nel range di prezzo: " + min + " - " + max);
        }
    }*/
}


