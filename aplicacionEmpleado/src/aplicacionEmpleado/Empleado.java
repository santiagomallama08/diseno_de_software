package aplicacionEmpleado;

public class Empleado {
	private int id; 
	private String firstName;
	private String lastName;
	private int salary;
	
	public Empleado (int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;			
	}
	public int getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getName() {
		String Name = firstName + lastName;
		return Name;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public int getSalarioAnual() {
		int SalarioAnual = salary*12;
		return SalarioAnual;
	}
	public int raiseSalary(int percent) {
		int raiseSalary = salary*30/100;
		return raiseSalary;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	
}
