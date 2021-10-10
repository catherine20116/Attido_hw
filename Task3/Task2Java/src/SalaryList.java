import java.util.ArrayList;
import java.util.List;


public class SalaryList {
	Employee employee;
	List<Employee> employees;
	private static final int CONSIDERATION_LIMIT = 3000;
	
	public SalaryList() {
		this.employees = new ArrayList<>();
	}
	
	public void setList(Employee employee) {
		this.employees.add(employee);
	}
	
	public void showList() {
		for (Employee employee : employees) {
			System.out.println(employee.getFirstName() + " " + employee.getLastName() + ". Salary: " + employee.getSalary());
		}
	}
	
	public void updateSalary(int rangeBottom, int rangeTop, double multiplier) {
		for (Employee employee : employees) {
			if(employee.getTaxableSalary() > rangeBottom && employee.getTaxableSalary() < rangeTop && employee.getTaxableSalary() < CONSIDERATION_LIMIT) {
				double newSalary = employee.getSalary() * multiplier;
				while((newSalary-employee.getSalary())>employee.getTax()) {
					newSalary = employee.getSalary() * multiplier;
					multiplier-=0.01;
				}
				employee.setSalary((int) newSalary);
			}
		}
	}
	
}
