package herenciaLibrosDiscos;

public class Libro extends Publicacion {
	protected int paginas;
	protected int añoPublicacion;
	
	public Libro(int paginas, int añoPublicacion,String titulo, float precio) {
		super(titulo,precio);
		this.paginas = paginas;
		this.añoPublicacion = añoPublicacion;
		
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [paginas=" + paginas + ", añoPublicacion=" + añoPublicacion + ", titulo=" + titulo + ", precio="
				+ precio + "]";
	}
	
}
