package aplicacionFabrica;

public class Carro {
	    private Llanta llantaDelantera;
	    private Llanta llantaTrasera;
	    private Chasis chasis;
	    private String color;
	    private int planta; // Nuevo atributo para identificar la planta

	    public Carro(Llanta llantaDelantera, Llanta llantaTrasera, Chasis chasis, String color, int planta) {
	        this.llantaDelantera = llantaDelantera;
	        this.llantaTrasera = llantaTrasera;
	        this.chasis = chasis;
	        this.color = color;
	        this.planta = planta; // Asignar la planta
	    }

	    @Override
	    public String toString() {
	        return "Carro - Color: " + color + "\n" + llantaDelantera + "\n" + llantaTrasera + "\n" + chasis + "\nPlanta: " + planta;
	    }
}
