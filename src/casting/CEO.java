package casting;



public class CEO extends Employee {

	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 2;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CEO Class : First Name "+this.firstname+" Last Name "+this.lastname+" salary is "+getSalary();
	}
}
