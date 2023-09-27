package herenciaDireccion;

public class Nombre {
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	
	public Nombre(String nombre, String primerApellido, String segundoApellido) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.setSegundoApellido(segundoApellido);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPrimerApellido() {
		return primerApellido;
	}
	
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	public String toString () {
		return " nombre : " + nombre +  " Con primer apellido : " + primerApellido + "Y segundo apellido " + segundoApellido ;
	}
	
}
