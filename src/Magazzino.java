import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Magazzino {
    private String nomeMagazzino;
    private String informazioniMagazzino;
    private String descrizioneMagazzino;
    private String cittaMagazzino;
    private HashMap<String, Carrello> listaCarrelli;
    private Carrello carrello;

    public Magazzino(String nomeMagazzino, String informazioniMagazzino, String descrizioneMagazzino, String cittaMagazzino) {
        this.nomeMagazzino = nomeMagazzino;
        this.informazioniMagazzino = informazioniMagazzino;
        this.descrizioneMagazzino = descrizioneMagazzino;
        this.cittaMagazzino = cittaMagazzino;
        this.listaCarrelli = new HashMap<>();
    }

    public String getNomeMagazzino() {
        return nomeMagazzino;
    }

    public void setNomeMagazzino(String nomeMagazzino) {
        this.nomeMagazzino = nomeMagazzino;
    }

    public String getInformazioniMagazzino() {
        return informazioniMagazzino;
    }

    public void setInformazioniMagazzino(String informazioniMagazzino) {
        this.informazioniMagazzino = informazioniMagazzino;
    }

    public String getDescrizioneMagazzino() {
        return descrizioneMagazzino;
    }

    public void setDescrizioneMagazzino(String descrizioneMagazzino) {
        this.descrizioneMagazzino = descrizioneMagazzino;
    }

    public String getCittaMagazzino() {
        return cittaMagazzino;
    }

    public void setCittaMagazzino(String cittaMagazzino) {
        this.cittaMagazzino = cittaMagazzino;
    }

    public void visualizzaDettagliMagazzino() {
        System.out.println("Il magazzino dal nome: \"" + getNomeMagazzino() + "\", si trova a: " + getCittaMagazzino());
        System.out.println("Descrizione magazzino: " + getDescrizioneMagazzino());
        System.out.println("Informazioni: " + getInformazioniMagazzino());
    }

    public void aggiungiCarrelloAllaLista(Carrello carrello) {
        this.listaCarrelli.put(carrello.getNomeCarrello(), carrello);
    }

    public void rimuoviCarrelloDaLista(Carrello carrello) {
        this.listaCarrelli.remove(carrello.getNomeCarrello());
    }

    public void stampaListaCarrelli() {
        System.out.println("Il magazzino \"" + getNomeMagazzino() + "\" contiene i seguenti carrelli:");
        for(Map.Entry<String, Carrello> carrello: this.listaCarrelli.entrySet()) {
            System.out.println(carrello.getKey());
        }
    }

    public void visualizzaCarrelloConNome(String nomeCarrello) {
        this.listaCarrelli.get(nomeCarrello).stampaDettagliCarrello();
    }

    public void ricercaTipoDispositivo(EnumProdottiElettronici tipoDispositivo, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : this.listaCarrelli.get(nomeCarrello).getArticoli()) {
            if (tipoDispositivo.equals(articolo.getTipo())) {
                System.out.println(articolo.stampaDettagliProdotto());
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Dispositivo non trovato");
        }
    }

    public void ricercaProduttore(String nomeProduttore, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : this.listaCarrelli.get(nomeCarrello).getArticoli()) {
            if (nomeProduttore.equals(articolo.getProduttore())) {
                System.out.println(articolo.stampaDettagliProdotto());
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    public void ricercaModello(String nomeModello, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : this.listaCarrelli.get(nomeCarrello).getArticoli()) {
            if (nomeModello.equals(articolo.getModello())) {
                System.out.println(articolo.stampaDettagliProdotto());
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Modello non disponibile");
        }
    }

    public void ricercaPrezzo (Double prezzo, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : this.listaCarrelli.get(nomeCarrello).getArticoli()) {
            if (Objects.equals(prezzo, articolo.getPrezzo())) {
                System.out.println(articolo.stampaDettagliProdotto());
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo del costo di: " + prezzo + "€");
        }
    }

    public void ricercaRangePrezzo (Double min, Double max, String nomeCarrello) {

        boolean elementoPresente = false;

        for (Prodotti articolo : this.listaCarrelli.get(nomeCarrello).getArticoli()) {
            if (min <= articolo.getPrezzo() && max >= articolo.getPrezzo()) {
                System.out.println(articolo.stampaDettagliProdotto());
                elementoPresente = true;
            }
        }
        if (!elementoPresente) {
            System.out.println("Errore: Nessun articolo presente nel range di prezzo: " + min + " - " + max);
        }
    }
}