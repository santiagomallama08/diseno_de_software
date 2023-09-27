package herenciaDireccion;

public class Programa {

	public static void main(String[] args) {
		Nombre nombre1 = new Nombre ("santiago ","mallama ","muñoz ");
		Direccion direccion = new Direccion(nombre1.getNombre(),nombre1.getPrimerApellido(),nombre1.getSegundoApellido(),"Las Americas","Pasto","Nariño",520001);
		System.out.println("Datos registrados con exito:" + direccion);
		}
}
			

