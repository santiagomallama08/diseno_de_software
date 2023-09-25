package aplicacionFabrica;

public class Chasis {
	 private int peso;
	    private String material;

	    public Chasis(int peso, String material) {
	        this.peso = peso;
	        this.material = material;
	    }

	    @Override
	    public String toString() {
	        return "Chasis - Peso: " + peso + " kg, Material: " + material;
	    }
	

}
