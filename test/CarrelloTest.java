import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarrelloTest {

    @Test
    public void testAggiunzioneProdotto() {
        Carrello carrello = new Carrello();
        Smartphone smartphone1 = new Smartphone(Tipo.Smartphone, "Apple", "Iphone12", "Ciao", 7.0, 128, 899.99, 999.99, 827451719);

        List<ArticoliElettronici> list = carrello.aggiungiProdotto(smartphone1);
        assertTrue(list.contains(smartphone1));
    }

}