package aplicacionCuenta;

public class Programa {
	public Programa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta1 = new Cuenta("Uala", "SANTIAGO MUÑOZ " , 1000);
		Cuenta cuenta2 = new Cuenta( "NU BANK"," BYRON MALLAMA " , 2000); 
	    System.out.println(cuenta1);
		System.out.println(cuenta2); 
		
		//
		
		cuenta1.credit(0); 
		cuenta2.debit(0); 
		//
		System.out.println(" La cuenta despues de las transacciones tiene un estado de: " + cuenta1); 
		System.out.println("La cuenta despues de las transacciones tiene un esatado de: " + cuenta2 ); 
	}
	
	

}
