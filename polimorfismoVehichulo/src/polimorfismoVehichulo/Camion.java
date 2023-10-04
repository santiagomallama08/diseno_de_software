package polimorfismoVehichulo;

public class Camion extends Vehiculo {
	protected Remolque remolque;
	
	public Camion() {
		
	}
	public Camion(String Matricula) {
		super(Matricula);	
	}
	public void ponRemolque(Remolque remolque) {
		this.remolque = remolque;		
	}
	public void quitarRemolque(Remolque remolque) {
		this.remolque = null;
	}
	@Override
	public void acelerar(int cantidad) {
		if (super.velocidad>100) {
			System.out.println("Demasiado rapido");
			if(remolque != null) {
				cantidad/=2;
			}
		}
		
		super.acelerar(cantidad);
	}
	@Override
	public String toString() {
		if(remolque !=null) {
			return super.toString()+','+remolque.toString();
		}else {
			return super.toString();
		}
	}
	
}
