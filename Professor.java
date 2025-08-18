package lab05sol;

public class Professor extends Lecturer {
	private double bonus;
    private String role;
	
	public Professor() {
		bonus = 5000;
	}
	
	public Professor(String name, int age, String email, double salary, double bonus, String role) {
		super(name, age, email, salary);
		this.bonus = bonus;
		this.role = role;
	}

	public double getBonus() {
		return bonus;
	}
    	
    public String getRole() {
		return role;
	}

    public double getSalary() {
		return super.getSalary() + bonus;
	}

	public void setBonus(double bonus) {
        if(bonus >= 0){
            this.bonus = bonus;
        }
		
	}

    public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return super.toString() + getBonus() + "\n";
	}
}