package herenciaCiruclo;

public class Circulo {
	protected double radius = 1.0;
	protected String color ="red";
	
	public Circulo () {
	}
	public Circulo (double radius) {
		this.radius = radius;
	}
	
	public Circulo(double radius, String color) {
		this.radius = radius;
		this.color = color;
		
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		double Area = Math.PI*Math.pow(radius,2);
		return Area;
	}
	@Override
	public String toString() {
		return "Circulo [radius=" + radius + ", color=" + color + ", Area =" + getArea() + "]";
	}
	
	
}
