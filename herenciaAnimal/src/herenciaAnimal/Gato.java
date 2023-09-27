package herenciaAnimal;

public class Gato extends Mammal {
	public Gato (String name) {
		super(name);	
	}
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Gato [Mammal[Animal[name=" + name + "]]]";
	}
	

}
