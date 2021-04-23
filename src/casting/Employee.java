package casting;



public class Employee {
	public String firstname;
	public String lastname;
	private  int salary;
	public String position;
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput,String position) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position = position;
	}
	
	public void hello() {
		System.out.println("Hello "+this.firstname);
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void checkPosition() {
		System.out.println("My position is "+position);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Class : First Name "+this.firstname+" Last Name "+this.lastname+" salary is "+this.salary;
	}
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("F"+i,"L"+i, 1000+i);
	        System.out.println(employees[i].toString());
		}
		
		
		//check position
		Employee em = new Employee("C","L",500,"Programmer");
		em.checkPosition();
	}
}
