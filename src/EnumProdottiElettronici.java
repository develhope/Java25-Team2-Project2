public enum EnumProdottiElettronici {
    SMARTPHONE ("Smartphone"),
    TABLET ("Tablet"),
    NOTEBOOK ("Notebook");

    private String descrizione;

    EnumProdottiElettronici(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
