package aplicacionEmpleado;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado(129963, "Andres", "Jaramillo", 2000000);
		Empleado empleado2 = new Empleado(234521, "Marcela", "Mendez", 30000000);
		
		System.out.println("estos son los datos del empleado" + empleado1);
		System.out.println("estos son los datos del empleado" + empleado2);
		
		System.out.println("el incremento del 30% en el salario es igual " + empleado1.raiseSalary(0));
		System.out.println("el incremento del 30% en el salario es igual " + empleado2.raiseSalary(0));

	}

}
