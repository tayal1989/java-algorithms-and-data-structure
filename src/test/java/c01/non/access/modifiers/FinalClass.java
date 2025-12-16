package c01.non.access.modifiers;

public final class FinalClass {
	
	final static int i = 10 ;
	
	public final void sampleMethod() {
		System.out.println("Final Class Final Method");
	}

	public static void main(String[] args) {
		// i = 11 ;	// final class var value cannot be changed
	}

}
