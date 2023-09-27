package herenciaShape;

public class Circulo extends Shape {
	protected double radius ;
	
	public Circulo() {
		
	}
	public Circulo(double radius) {
		this.radius= radius;
	}
	public Circulo(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double Area = Math.PI*Math.pow(radius, 2);
		return Area;
	}
	public double GetPerimetro() {
		double Perimetro = 2*Math.PI*radius;
		return Perimetro;
	}

	@Override
	public String toString() {
	    return "Circulo [shape [color=" + getColor() + ", filled=" + isFilled() + "], radius=" + radius + "]";
	}

	

}
