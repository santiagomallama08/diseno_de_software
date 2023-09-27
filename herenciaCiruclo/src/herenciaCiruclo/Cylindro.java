package herenciaCiruclo;

public class Cylindro extends Circulo{
	private double height = 1.0;
	
	public Cylindro() {
		
	}
	public Cylindro(double raius) {
		
	}
	public Cylindro(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public Cylindro(double radius, double height, String color) {
		super(radius, color);
		this.height = height; 
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolumen () {
		double Volumen = Math.PI*Math.pow(radius,2)*height;
		return Volumen;
	}
	@Override
	public String toString() {
		return "Cylindro [height=" + height + ", radius=" + radius + ", color=" + color + ", Volumen="
				+ getVolumen() + "]";
	}
	
	
}
