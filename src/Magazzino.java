public class Magazzino {
    public String nomeMagazzino;
    public String informazioniMagazzino;
    public String descrizioneMagazzino;
    public String cittaMagazzino;

    public Magazzino(String nomeMagazzino, String informazioniMagazzino, String descrizioneMagazzino, String cittaMagazzino, Carrello carrello1) {
        this.nomeMagazzino = nomeMagazzino;
        this.informazioniMagazzino = informazioniMagazzino;
        this.descrizioneMagazzino = descrizioneMagazzino;
        this.cittaMagazzino = cittaMagazzino;
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
        System.out.println("Il magazzino " + getNomeMagazzino() + " si trova a: " + getCittaMagazzino());
        System.out.println("Questo magazzino " + getDescrizioneMagazzino() + " e " + getInformazioniMagazzino());
    }


    public void listaArticoliCarrello(String nomeCarrello) {
        Carrello carrello = new Carrello(nomeCarrello);
        System.out.println(carrello.articoli);
    }
}