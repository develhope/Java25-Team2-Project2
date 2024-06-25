import java.util.Objects;

public abstract class Prodotti implements InterfacciaProdotti {

    private EnumProdottiElettronici tipo;
    private String descrizione;
    private Double prezzo;

    public Prodotti(EnumProdottiElettronici tipo, String descrizione, Double prezzo) {
        this.tipo = tipo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public EnumProdottiElettronici getTipo() {
        return tipo;
    }

    public void setTipo(EnumProdottiElettronici tipo) {
        this.tipo = tipo;
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

    public abstract String getProduttore();

    public abstract String getModello();

    @Override
    public String stampaDettagliProdotto() {
        return "Tipo prodotto: " + getTipo() + "\nPrezzo: " + getPrezzo() + "\nDescrizione: " + getDescrizione();
    }

}