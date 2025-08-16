package lab05sol;

public class Lecturer extends Person {
	private double salary;
	
	public Lecturer() {
		salary = 40000;
	}
	
	public Lecturer(String name, int age, String email, double salary) {
		super(name, age, email);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
	}

	@Override
	public String toString() {
		return super.toString() + salary + "\n";
	}
}