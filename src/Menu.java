import java.util.Scanner;

public class Menu {

    public Menu () {
    }

    public void creazioneCarrello () {

        Magazzino dispositivi = new Magazzino();
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);
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
            for (int i = 0; i < dispositivi.ritornoElencoArticoli().size(); i++) {
                System.out.println((i + 1) + ". " + dispositivi.ritornoElencoArticoli().get(i).checkTipo() + ": " + dispositivi.ritornoElencoArticoli().get(i).checkProduttore() + " " + dispositivi.ritornoElencoArticoli().get(i).checkModello() +
                        " - Prezzo: " + dispositivi.ritornoElencoArticoli().get(i).checkPrezzoVendita() + "€");
            }
            System.out.println("Seleziona il dispositivo da aggiungere:");
            int indiceAggiunzione = scanner.nextInt();
            if (indiceAggiunzione > 0 && indiceAggiunzione <= dispositivi.ritornoElencoArticoli().size()) {
                carrello.aggiungiProdotto(dispositivi.ritornoElencoArticoli().get(indiceAggiunzione - 1));
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
}