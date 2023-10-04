package polimorfismoVehichulo;

public class Remolque {
	protected String descripcion;
	
	public Remolque() {
		
	}
	public Remolque(String descripcion) {
		this.descripcion = descripcion;
		
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Remolque [descripcion=" + descripcion + "]";
	}
	
	
		

}
