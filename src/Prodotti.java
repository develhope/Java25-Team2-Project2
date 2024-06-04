public abstract class Prodotti {

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

    @Override
    public String toString() {
        return "tipo='" + tipo + '\'' +
                ", produttore='" + produttore + '\'' +
                ", modello='" + modello + '\'' +
                ", descrizioneDispositivo='" + descrizioneDispositivo + '\'' +
                ", prezzoAcquisto=" + prezzoAcquisto +
                ", prezzoVendita=" + prezzoVendita +
                ", idProdotto=" + idProdotto;
    }
}