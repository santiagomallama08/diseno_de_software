package herenciaAnimal;

public class Programa {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Mateo");
		Mammal mammal1 = new Mammal(animal1.name);
		Gato gato1 = new Gato(animal1.name);
		Perro perro1 = new Perro(animal1.name);
		
		
		System.out.println(animal1);
		System.out.println(mammal1);
		System.out.println(gato1);
		gato1.greets();
		System.out.println(perro1);
		perro1.greets();
		

	}

}
