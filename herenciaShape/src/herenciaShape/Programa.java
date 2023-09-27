package herenciaShape;

public class Programa {

	public static void main(String[] args) {
		Shape shape1 = new Shape("red", true);
		Circulo circulo1 = new Circulo(3.14);
		Rectangulo rectan1 = new Rectangulo(3.15,2.3); 
		Square square1 = new Square(23.1, rectan1.color,rectan1.filled,rectan1.getLength(),rectan1.getWidth());
		
		
		System.out.println(shape1);
		System.out.println(circulo1);
		System.out.println(rectan1);
		System.out.println(square1);
		

	}

}
