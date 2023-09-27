package herenciaLibrosDiscos;

public class Publicacion {
	protected String titulo;
	protected float precio;
	
	public Publicacion(String titulo, float precio) {
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if (precio>0) {
			this.precio = precio;
		}else {
			System.out.println("el numero debe ser positivo");
		}
		
	}


	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", precio = $" + precio + "]";
	}
	

}
