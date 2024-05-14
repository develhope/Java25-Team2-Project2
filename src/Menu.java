import java.util.Scanner;

public class Menu {
    Magazzino magazzino;
    Carrello carrello;
    MetodiRicerca metodiRicerca;
    Scanner scanner;

    public Menu() {
        magazzino = new Magazzino();
        carrello = new Carrello();
        metodiRicerca = new MetodiRicerca();
        scanner = new Scanner(System.in);
    }

    public void creazioneCarrello() {

        int scelta;

        do {

            System.out.println("Menu:");
            System.out.println("0. Esci");
            System.out.println("1. Aggiungi articolo");
            System.out.println("2. Rimuovi articolo");
            System.out.println("3. Visualizza carrello");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                case 1:
                    System.out.println("Elenco dei dispositivi disponibili:");
                    for (int i = 0; i < magazzino.ritornoElencoArticoli().size(); i++) {
                        System.out.println((i + 1) + ". " + magazzino.ritornoElencoArticoli().get(i).checkTipo() + ": " + magazzino.ritornoElencoArticoli().get(i).checkProduttore() + " " + magazzino.ritornoElencoArticoli().get(i).checkModello() +
                                " - Prezzo: " + magazzino.ritornoElencoArticoli().get(i).checkPrezzoVendita() + "€");
                    }
                    System.out.println("Seleziona il dispositivo da aggiungere:");
                    int indiceAggiunzione = scanner.nextInt();
                    if (indiceAggiunzione > 0 && indiceAggiunzione <= magazzino.ritornoElencoArticoli().size()) {
                        carrello.aggiungiProdotto(magazzino.ritornoElencoArticoli().get(indiceAggiunzione - 1));
                        System.out.println("Dispositivo aggiunto al carrello.");
                    } else {
                        System.out.println("Selezione non valida.");
                    }
                    break;
                case 2:
                    System.out.println("Elenco articoli nel carrello:");
                    carrello.visualizzaCarrello();
                    System.out.println("Cosa vuoi rimuovere?");
                    int indiceRimozione = scanner.nextInt();
                    if (indiceRimozione > 0 && indiceRimozione <= carrello.visualizzaCarrello().size()) {
                        carrello.rimuoviProdotto(carrello.articoli.remove(indiceRimozione - 1));
                        System.out.println("Dispositivo rimosso dal carrello.");
                    } else {
                        System.out.println("Selezione non valida.");
                    }
                    break;
                case 3:
                    carrello.visualizzaCarrello();
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        } while (scelta != 0);
    }

    public void ricercaDispositivi() {

        String scelta;
        Tipo tipoDispositivo;
        double prezzoVendita;
        double prezzoAcquisto;

        do {
            System.out.println("Selezionare criterio di ricerca:");
            System.out.println("0. Esci");
            System.out.println("1. Ricerca per tipo");
            System.out.println("2. Ricerca per produttore");
            System.out.println("3. Ricerca per modello");
            System.out.println("4. Ricerca per prezzo di vendita");
            System.out.println("5. Ricerca per prezzo di acquisto");
            System.out.println("6. Ricerca per range di prezzo");
            scelta = scanner.nextLine();
            System.out.println();


            switch (scelta) {
                case "0":
                    System.out.println("Uscita in corso...");
                    System.out.println();
                    break;
                case "1":
                    System.out.println("Inserire tipologia dispositivo:");
                    tipoDispositivo = Tipo.valueOf(scanner.nextLine());
                    metodiRicerca.ricercaTipoDispositivo(tipoDispositivo);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Inserire nome produttore:");
                    String nomeProduttore = scanner.nextLine();
                    metodiRicerca.ricercaProduttore(nomeProduttore);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Inserire nome modello:");
                    String nomeModello = scanner.nextLine();
                    metodiRicerca.ricercaModello(nomeModello);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Inserire prezzo:");
                    prezzoVendita = Double.parseDouble(scanner.nextLine());
                    metodiRicerca.ricercaPrezzoVendita(prezzoVendita);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Inserire prezzo:");
                    prezzoAcquisto = Double.parseDouble(scanner.nextLine());
                    metodiRicerca.ricercaPrezzoAcquisto(prezzoAcquisto);
                    System.out.println();
                    break;
                case "6":
                    System.out.println("Inserire prezzo minimo:");
                    double prezzoMinimo = Double.parseDouble(scanner.nextLine());
                    System.out.println("Inserire prezzo massimo");
                    double prezzoMassimo = Double.parseDouble(scanner.nextLine());
                    metodiRicerca.ricercaRangePrezzo(prezzoMinimo, prezzoMassimo);
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
                    System.out.println();
            }
        } while (!scelta.equals("0"));
    }
}