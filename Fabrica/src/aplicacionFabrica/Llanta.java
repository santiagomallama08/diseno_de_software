package aplicacionFabrica;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Llanta {
	private String tipo;
    private int tamaño;

    public Llanta(String tipo, int tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Llanta - Tipo: " + tipo + ", Tamaño: " + tamaño;
    }

}
