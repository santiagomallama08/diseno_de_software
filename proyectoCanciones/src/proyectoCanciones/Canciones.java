package proyectoCanciones;

import java.util.Iterator;
import java.util.List;

public class Canciones {
	private String titulo;
	private int duracionMinutos;
	private int duracionSegundos;
	private String interpretes;
	private String compositor;
	
	public Canciones() {
		
	}
	public Canciones(String titulo,int duracionMinutos, int duracionSegundos,String interpretes,String compositor) {
		this.titulo = titulo;
		this.duracionMinutos = duracionMinutos;
		this.duracionSegundos = duracionSegundos;
		this.interpretes = interpretes;
		this.compositor = compositor;			
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	public int getDuracionSegundos() {
		return duracionSegundos;
	}
	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}
	public String getInterpretes() {
		return interpretes;
	}
	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}
	public String getCompositor() {
		return compositor;
	}
	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	public static void eliminarCancion(List<Canciones> cancionesList, String titulo) {
        Iterator<Canciones> iterator = cancionesList.iterator();
        while (iterator.hasNext()) {
            Canciones cancion = iterator.next();
            if (cancion.getTitulo().equals(titulo)) {
                iterator.remove();
            }
        }
    }
	public void editarInformacion(String titulo, int duracionMinutos, int duracionSegundos, String interpretes, String compositor) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.interpretes = interpretes;
        this.compositor = compositor;
    }
	@Override
	public String toString() {
		return "albumLista [titulo=" + titulo + ", duracionMinutos=" + duracionMinutos + ", duracionSegundos="
				+ duracionSegundos + ", interpretes=" + interpretes + ", compositor=" + compositor + "]";
	}
	
}



