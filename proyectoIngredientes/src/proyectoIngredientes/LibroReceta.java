package proyectoIngredientes;
import java.util.ArrayList;
import java.util.List;

public class LibroReceta {
	
	    private List<Receta> recetas;

	    public LibroReceta() {
	        this.recetas = new ArrayList<>();
	    }

	    public void agregarReceta(Receta receta) {
	        recetas.add(receta);
	    }

	    public void modificarReceta(int indice, Receta nuevaReceta) {
	        if (indice >= 0 && indice < recetas.size()) {
	            recetas.set(indice, nuevaReceta);
	        } else {
	            System.out.println("Índice no válido. La receta no existe.");
	        }
	    }

	    public List<Receta> getRecetas() {
	        return recetas;
	    }
	}



