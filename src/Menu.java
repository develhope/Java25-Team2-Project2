import java.util.Scanner;

public class Menu {

    public Menu () {
    }

    public void creazioneCarrello () {

        Magazzino dispositivi = new Magazzino();
        dispositivi.disponibili();
        Scanner scanner = new Scanner(System.in);
        Carrello carrello = new Carrello();
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
            System.out.println("Uscita dal programma.");
            break;
        case 1:
            System.out.println("Elenco dei dispositivi disponibili:");
            for (int i = 0; i < dispositivi.disponibili().size(); i++) {
                System.out.println((i + 1) + ". " + dispositivi.disponibili().get(i).getTipo() + " " + dispositivi.disponibili().get(i).getModello() +
                        " - Prezzo: " + dispositivi.disponibili().get(i).getPrezzoVendita());
            }
            System.out.println("Seleziona il dispositivo da aggiungere:");
            int indiceAggiunzione = scanner.nextInt();
            if (indiceAggiunzione > 0 && indiceAggiunzione <= dispositivi.disponibili().size()) {
                carrello.aggiungiProdotto(dispositivi.disponibili().get(indiceAggiunzione - 1));
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
            if(indiceRimozione > 0 && indiceRimozione <= carrello.visualizzaCarrello().size()) {
                carrello.rimuoviProdotto(carrello.visualizzaCarrello().get(indiceRimozione - 1));
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