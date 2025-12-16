package b01.accessmodifier.first.pkg;

public class CallingProtectedMethod {

	public static void main(String[] args) {
		// Protected method can be accessed inside the same package
		System.out.println(ProtectedMethodClass.engine2000CC()) ;
	}

}
