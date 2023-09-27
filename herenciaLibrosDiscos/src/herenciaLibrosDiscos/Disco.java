package herenciaLibrosDiscos;

public class Disco extends Publicacion{
	protected float minutos;
	
	public Disco(float minutos, String titulo, float precio) {
		super(titulo, precio);
		this.minutos = minutos;	
	}

	public float getMinutos() {
		return minutos;
	}

	public void setMinutos(float minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Disco [minutos=" + minutos + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	

}
