import java.math.BigDecimal;
import java.util.Objects;

public abstract class Prodotti implements InterfacciaProdotti {

    private EnumProdottiElettronici tipo;
    private String descrizione;
    private BigDecimal prezzo;

    public Prodotti(EnumProdottiElettronici tipo, String descrizione, BigDecimal prezzo) {
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

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public abstract String getProduttore();

    public abstract String getModello();

    @Override
    public String stampaDettagliProdotto() {
        return "Tipo prodotto: " + getTipo() + "\nPrezzo: " + getPrezzo() + "\nDescrizione: " + getDescrizione();
    }

}