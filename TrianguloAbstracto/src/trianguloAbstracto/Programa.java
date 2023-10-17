package trianguloAbstracto;

public class Programa {

    public static void main(String[] args) {
        Escaleno trianguloEscaleno = new Escaleno(	12, 15);
        double perimetro = trianguloEscaleno.Perimetro();
        double area = trianguloEscaleno.CalcularAreaConHipotenusa();

        System.out.println("Triángulo Escaleno:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
        
        
    	Acutangul trianguloAcutangulo = new Acutangul(20,40);
    	double perimetro1 = trianguloAcutangulo.Perimetro();
    	double area1 = trianguloAcutangulo.CalcularAreaConHipotenusa();
    	
    	System.out.println("triangulo acutangulo ");
    	System.out.println("perimetro es igual a " + perimetro1);
    	System.out.println("area es igual a "+ area1);

    	}
}