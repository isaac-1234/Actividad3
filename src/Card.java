import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Card {
    private String palocolor;
    private String valor;

    public Card(String palocolor, String valor) {
        this.palocolor = palocolor;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return palocolor + "," + valor;
    }
}