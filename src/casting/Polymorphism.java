package casting;


public class Polymorphism {
	
	public static void main(String[] args) {
		CEO ceo = new CEO("C","L", 10);
		Employee employee = (Employee)ceo;
		
		System.out.println("ceo ==> "+ceo);
		System.out.println("employee ==>"+employee);
	}

}
