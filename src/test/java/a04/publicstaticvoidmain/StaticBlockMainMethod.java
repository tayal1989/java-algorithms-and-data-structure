package a04.publicstaticvoidmain;

public class StaticBlockMainMethod {
	static{	// With only this, JVM will throw error saying no main method found
		System.out.println("In static block");
	}
	
	public static void main(String[] args) {
		System.out.println("In Main Block");
	}
}
