package herenciaPerson;

public class Staff extends Person{
	protected String school;
	protected double pay;
	
	public Staff(String name, String adress, String school, double pay) {
		super(name, adress);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", adress=" + adress + ", school=" + school + ", pay=" + pay + "]";
	}
	
	

}
