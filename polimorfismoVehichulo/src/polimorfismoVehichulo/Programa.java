package polimorfismoVehichulo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche("BAB89E",20);
		Camion camion1 = new Camion("ADV525");
		Remolque remolque1 = new Remolque("tiene remolque");
		
		coche1.acelerar(30);
		camion1.ponRemolque(remolque1);
		camion1.acelerar(150);
		
		System.out.println("Información del Coche: " + coche1.toString());
        System.out.println("Número de Puertas del Coche: " + coche1.getNpuertas());
        System.out.println();

        System.out.println("Información del Camión: " + camion1.toString());
        System.out.println();

        
        camion1.quitarRemolque(remolque1);

   
        camion1.acelerar(0);

        
        System.out.println("Información del Camión (sin remolque): " + camion1.toString());
		

	}

}
