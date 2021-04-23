package abstratAndEnum;

public class FinalTest {

	final static String name = "A";
	Sex sex;
	
	public static void main(String[] args) {
		//name = "B";
		
		FinalTest finalTest = new FinalTest();
		
		//FinalTest.hihihi() //
		finalTest.sex = Sex.MALE;
		
		System.out.println(finalTest.sex);
		
		Test test = new Test();
		
		

	}
	
	public final void hihihi() {
		System.out.println("hihihi");
	}
	
	
}
