package herenciaCH;

public class Cilindro extends Circulo {
	protected double altura;

    public void leerAltura(double altura, int i) {
    	this.altura = altura;
    } 

    
    public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

    public double areac() {
    	return 2 * Math.PI * radio * altura + 2 *  Math.PI * Math.pow(radio, 2);
    }
	public double volumen() {
        return   Math.PI * Math.pow(radio, 2) * altura;
    }
	
	
	

}
