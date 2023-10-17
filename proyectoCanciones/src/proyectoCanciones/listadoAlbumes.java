package proyectoCanciones;

public class listadoAlbumes {
	private String titulo;
	private int añoProduccion;
	private String Descripcion;
	private String artistas;
	private int Canciones;
	private medioGrabacion mediograbacion;
	
	
	public listadoAlbumes() {
		
	}
	public listadoAlbumes(String titulo, int añoProduccion,String Descripcion, String artistas,int Canciones,medioGrabacion mediograbacion) {
		this.mediograbacion = mediograbacion;
		this.titulo = titulo;
		this.añoProduccion = añoProduccion;
		this.Descripcion = Descripcion;
		this.artistas = artistas;
		this.Canciones = Canciones;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAñoProduccion() {
		return añoProduccion;
	}
	public void setAñoProduccion(int añoProduccion) {
		this.añoProduccion = añoProduccion;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getArtistas() {
		return artistas;
	}
	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}
	public int getCanciones() {
		return Canciones;
	}
	public void setCanciones(int canciones) {
		Canciones = canciones;
	}
	public medioGrabacion getMediograbacion() {
		return mediograbacion;
	}
	public void setMediograbacion(medioGrabacion mediograbacion) {
		this.mediograbacion = mediograbacion;
	}
	@Override
	public String toString() {
		return "listadoAlbumes [titulo=" + titulo + ", añoProduccion=" + añoProduccion + ", Descripcion=" + Descripcion
				+ ", artistas=" + artistas + ", Canciones=" + Canciones + ", mediograbacion=" + mediograbacion + "]";
	}
	

}
