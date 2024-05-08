import java.util.Objects;

public class MetodiRicerca {
    public MetodiRicerca () {
    }

    public String ricercaModello (Articoli x) {
        if (Objects.equals(x.getModello())) {
            return x.getModello();
        }
        return "Dispositivo non presente.";
    }

}
