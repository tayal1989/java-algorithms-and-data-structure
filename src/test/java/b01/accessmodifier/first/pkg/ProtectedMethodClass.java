package b01.accessmodifier.first.pkg;

public class ProtectedMethodClass {

	public int engine1000CC() {
		System.out.println("Parent - 1000CC engine");
		return 0 ;
	}
	
	protected static int engine2000CC() {
		System.out.println("Parent - Protected method - 2000CC engine");
		return 1 ;
	}
}
