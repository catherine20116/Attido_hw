public class Programm {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("John", "Johnson", 2000, 500);
		Employee employee2 = new Employee("Bob", "Bobson", 4000, 200);
		
		SalaryList employees = new SalaryList();
		
		employees.setList(employee1);
		employees.setList(employee2);
		
		employees.updateSalary(100, 5000, 1.1);
		employees.showList();
		
	}
}
