public interface InterfacciaProdotti {

    void stampaDettagli();

    void ricercaTipoDispositivo(String tipoDispositivo, String nomeCarrello);

    void ricercaProduttore(String nomeProduttore, String nomeCarrello);

    void ricercaPrezzo(Double prezzo, String nomeCarrello);

    void ricercaRangePrezzo(Double min, Double max, String nomeCarrello);
}
