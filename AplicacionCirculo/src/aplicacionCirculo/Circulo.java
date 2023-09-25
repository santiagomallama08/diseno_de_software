package aplicacionCirculo;

public class Circulo {
	double radius ;
	double area ;
	double circuferencia;

	public Circulo(double radius, double area, double circuferencia) {
		this.radius = radius;
		this.area = area;
		this.circuferencia = circuferencia;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area; 
	}
	public double getCircuferencia() {
		return circuferencia;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radius + ", area=" + area + ", circuferencia=" + circuferencia + "]";
	}
	
}
