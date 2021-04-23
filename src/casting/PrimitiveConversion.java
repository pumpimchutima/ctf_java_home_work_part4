package casting;


public class PrimitiveConversion {

	public static void main(String[] args) {
		int myInt = 10;
		float myFloat = myInt;
		
		float newFloat = 5.5f;
		int newInt = (int) newFloat;
		
		System.out.println("myFloat "+myFloat);
		System.out.println("newInt "+newInt);
	}
}
