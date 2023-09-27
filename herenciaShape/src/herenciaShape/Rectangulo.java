package herenciaShape;

public class Rectangulo extends Shape {
	protected double width ;
	protected double length ;
	
	public Rectangulo() {
		
	}
	public Rectangulo(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangulo (String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		double Area =width*length;
		return Area;
	}
	public double getPerimetro() {
		double Perimetro = (2*width)+(2*length);
		return Perimetro;
	}
	@Override
	public String toString() {
		return "Rectangulo [Shape[color=" + color + ", filled=" + filled+"],  width=" + width + ", length=" + length + "]";
	}
	
	

}
