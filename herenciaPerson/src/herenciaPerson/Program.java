package herenciaPerson;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person ("andres" , "calle 20a ");
		Estudiante estudiante1 = new Estudiante(person1.getName(),person1.getAdress(),"medicina",5, 4524145.5 );
		Staff staff1 = new Staff (person1.getName(),person1.getAdress(),"universidad cooperativa", 15000);
		
		System.out.println(person1);
		System.out.println(estudiante1);
		System.out.println(staff1);

	}

}
