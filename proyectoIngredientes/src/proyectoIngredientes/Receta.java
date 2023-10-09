package proyectoIngredientes;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private String nombre;
    private int tiempoPreparacionMinutos;
    private List<Ingredientes> ingredientes;
    private int cantidadPersonas;
    private String descripcion;

    public Receta(String nombre, int tiempoPreparacionMinutos, int cantidadPersonas, String descripcion) {
        this.nombre = nombre;
        this.tiempoPreparacionMinutos = tiempoPreparacionMinutos;
        this.ingredientes = new ArrayList<>();
        this.cantidadPersonas = cantidadPersonas;
        this.descripcion = descripcion;
    }

    // Métodos para acceder a los atributos (getters y setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoPreparacionMinutos() {
        return tiempoPreparacionMinutos;
    }

    public void setTiempoPreparacionMinutos(int tiempoPreparacionMinutos) {
        this.tiempoPreparacionMinutos = tiempoPreparacionMinutos;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void agregarIngrediente(Ingredientes ingrediente) {
        ingredientes.add(ingrediente);
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "nombre='" + nombre + '\'' +
                ", tiempoPreparacionMinutos=" + tiempoPreparacionMinutos +
                ", ingredientes=" + ingredientes +
                ", cantidadPersonas=" + cantidadPersonas +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    
    
}
