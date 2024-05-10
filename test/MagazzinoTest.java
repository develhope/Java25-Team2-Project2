import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagazzinoTest {

    @Test
    public void ritornoElencoArticoliNonRitornaNull() {
        Magazzino magazzino = new Magazzino();
        List<ArticoliElettronici> list = magazzino.ritornoElencoArticoli();
        assertNotNull(list);
    }


}