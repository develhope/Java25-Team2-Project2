import java.util.Scanner;

public class Menu {
    Magazzino magazzino;
    Carrello carrello;
    Scanner scanner;

    public Menu() {
        magazzino = new Magazzino();
        carrello = new Carrello();
        scanner = new Scanner(System.in);
    }

    public void menuPrincipale () {
        //Con questo ciclo do/while ripetiamo questo blocco di codice fintanto che non diamo come input "0"
        // o finchè non passiamo ad un altro ciclo do/while.

        int scelta;
        int indice = 0;

        do {

            System.out.println("Selezionare operazione:");
            System.out.println("0 - Uscita");
            System.out.println("1 - Accesso al magazzino");
            System.out.println("2 - Aggiungi articolo al magazzino");
            System.out.println("3 - Ricerca");
            System.out.println("4 - Accesso al carrello");

            scelta = scanner.nextInt();
            System.out.println(" ");

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Dispositivi presenti nel magazzino:");
                    for (ArticoliElettronici articolo : magazzino.listaDispositivi) {
                        System.out.println(articolo);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Cosa vuoi aggiungere?");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Notebook");
                    System.out.println("3. Tablet");
                    Integer sceltaTipo = scanner.nextInt();
                    System.out.println();
                    if (sceltaTipo == 1) {
                        magazzino.aggiungiSmartphone();
                        for (ArticoliElettronici articolo : magazzino.aggiungiSmartphone()) {
                            System.out.println(articolo);
                        }
                    } else if (sceltaTipo == 2) {
                        for (ArticoliElettronici articolo : magazzino.aggiungiNotebook()) {
                            System.out.println(articolo);
                        }
                    } else if (sceltaTipo == 3) {
                        for (ArticoliElettronici articolo : magazzino.aggiungiTablet()) {
                            System.out.println(articolo);
                        }
                    } else if (sceltaTipo < 1 || sceltaTipo > 3) {
                        System.out.println("scelta non valida");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Criterio di ricerca:");
                    System.out.println();
                    ricercaDispositivi();
                    System.out.println();
                    break;
                case 4:
                    creazioneCarrello();
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (scelta != 0);
        scanner.close();
    }

    public void creazioneCarrello() {

        int scelta;

        do {

            System.out.println("Menu:");
            System.out.println("0. Esci");
            System.out.println("1. Aggiungi articoli");
            System.out.println("2. Rimuovi articoli");
            System.out.println("3. Visualizza carrello");
            System.out.println("4. Calcolo prezzo medio per articolo");
            System.out.println("5. Acquista articoli");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                case 1:
                    System.out.println("Elenco dei dispositivi disponibili:");
                    for (int i = 0; i < magazzino.listaDispositivi.size(); i++) {
                        System.out.println((i + 1) + ". " + magazzino.listaDispositivi.get(i).checkTipo() + ": " + magazzino.listaDispositivi.get(i).checkProduttore() + " " + magazzino.listaDispositivi.get(i).checkModello() +
                                " - Prezzo: " + magazzino.listaDispositivi.get(i).checkPrezzoVendita() + "€");
                    }
                    System.out.println("Seleziona il dispositivo da aggiungere:");
                    int indiceAggiunzione = scanner.nextInt();
                    if (indiceAggiunzione > 0 && indiceAggiunzione <= magazzino.listaDispositivi.size()) {
                        carrello.aggiungiProdotto(magazzino.listaDispositivi.get(indiceAggiunzione - 1));
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
                case 4:
                    System.out.println();
                    System.out.println("Il prezzo medio di ogni articolo è di: " + carrello.calcoloMediaPrezzi() + "€");
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    carrello.finalizzaOperazioneVendita();
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        } while (scelta != 0);
    }

    public void ricercaDispositivi() {

        Integer scelta;
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
            scelta = scanner.nextInt();


            switch (scelta) {
                case 0:
                    System.out.println("Uscita in corso...");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Inserire tipologia dispositivo:");
                    scanner.nextLine();
                    tipoDispositivo = Tipo.valueOf(scanner.nextLine());
                    magazzino.ricercaTipoDispositivo(tipoDispositivo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Inserire nome produttore:");
                    scanner.nextLine();
                    String nomeProduttore = scanner.nextLine();
                    magazzino.ricercaProduttore(nomeProduttore);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Inserire nome modello:");
                    scanner.nextLine();
                    String nomeModello = scanner.nextLine();
                    magazzino.ricercaModello(nomeModello);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Inserire prezzo:");
                    prezzoVendita = scanner.nextDouble();
                    magazzino.ricercaPrezzoVendita(prezzoVendita);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Inserire prezzo:");
                    prezzoAcquisto = scanner.nextDouble();
                    magazzino.ricercaPrezzoAcquisto(prezzoAcquisto);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Inserire prezzo minimo:");
                    double prezzoMinimo = scanner.nextDouble();
                    System.out.println("Inserire prezzo massimo");
                    double prezzoMassimo = scanner.nextDouble();
                    magazzino.ricercaRangePrezzo(prezzoMinimo, prezzoMassimo);
                    System.out.println();
                    break;
                default:
                    System.out.println("Scelta non valida");
                    System.out.println();
            }
        } while (scelta != 0);
    }
}