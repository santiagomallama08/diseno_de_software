package herenciaAnimal;

public class Perro extends Mammal{
	public Perro(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Perro anotherDog) {
		System.out.println("Woooof");
	}
	@Override
	public String toString() {
		return "Perro [mammal[animal[name=" + name + "]]]";
	}
}
