package polimorfismoVehichulo;

public class Vehiculo {
	
	protected String Matricula;
	protected double velocidad =0;
	
	public Vehiculo() {
		
	}
	public Vehiculo(String Matricula) {
		this.Matricula = Matricula;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	@Override
	public String toString() {
		return "Vehiculo [Matricula=" + Matricula + ", velocidad Km/h =" + velocidad + "]";
	}
	
	public void acelerar (int cantidad) {
		velocidad+=cantidad;
	}

}
