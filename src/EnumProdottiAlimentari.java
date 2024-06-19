public enum EnumProdottiAlimentari {
    FRUTTA ("Frutta"),
    CARNE ("Carne"),
    PESCE ("Pesce"),
    PASTA ("Pasta"),
    PANE ("Pane");

    private String descrizione;

    EnumProdottiAlimentari (String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione () {
        return descrizione;
    }
}
