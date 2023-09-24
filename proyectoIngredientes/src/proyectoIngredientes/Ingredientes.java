package proyectoIngredientes;
import java.util.ArrayList;
import java.util.List;

public class Ingredientes {
    // Atributos
    private String nombre;
    private String unidad;
    private int calorias;
    private String sitioCompras;
    private List<String> ingredientes;

    // Constructor
    public Ingredientes(String nombre, String unidad, int calorias, String sitioCompras) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.calorias = calorias;
        this.sitioCompras = sitioCompras;
        this.ingredientes = new ArrayList<>();
    }

    // Métodos para acceder a los atributos (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getSitioCompras() {
        return sitioCompras;
    }

    public void setSitioCompras(String sitioCompras) {
        this.sitioCompras = sitioCompras;
    }

    // Método para ver los ingredientes añadidos
    public List<String> getIngredientes() {
        return ingredientes;
    }

    // Método para añadir un ingrediente
    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    // Método para imprimir información sobre la clase
    @Override
    public String toString() {
        return "Lista de ingredientes: [nombre= " + nombre + ", unidad=  " + unidad + ", calorias=" + calorias + ", sitioCompras= "
                + sitioCompras + ", ";
    }

}