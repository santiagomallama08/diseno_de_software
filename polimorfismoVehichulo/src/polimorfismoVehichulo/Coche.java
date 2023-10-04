package polimorfismoVehichulo;

public class Coche extends Vehiculo{
	private int Npuertas;
	
	public Coche() {
		
	}
	public Coche(String Matricula, int Npuertas) {
		super(Matricula);
		this.Npuertas = Npuertas;
		
	}
	
	public int getNpuertas() {
		return Npuertas;
	}
	@Override
	public String toString() {
		return "Coche [Npuertas=" + Npuertas + ", Matricula=" + Matricula + ", velocidad=" + velocidad + "]";
	}
	

}
