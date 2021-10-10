
public class Employee {
	private String firstName;
	private String lastName;
	private int salary;
	private int bonus;
	private final int taxAllowance = 100;
	private final int taxLimitLow = 500;
	private final int taxLimitHigh = 4000;

	
	public Employee(String firstName, String lastName, int salary, int bonus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	} 
	
	public int getTaxableSalary() {
		return this.salary + this.bonus - this.taxAllowance;
	}
	
	public int getTax() {
		if(this.salary < this.taxLimitLow) {
			return (int) (getTaxableSalary()*0.10);
		} else if( this.salary > this.taxLimitHigh) {
			return (int) (this.taxLimitHigh*0.22 + (getTaxableSalary() - this.taxLimitHigh)*0.40);
		} else {
			return (int) (getTaxableSalary()*0.22);
		}
	}
	

}
