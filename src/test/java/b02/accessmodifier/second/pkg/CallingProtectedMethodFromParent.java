package b02.accessmodifier.second.pkg;

import b01.accessmodifier.first.pkg.ProtectedMethodClass;

public class CallingProtectedMethodFromParent extends ProtectedMethodClass {
	
	public static void engine3000CC() {
		ProtectedMethodClass pmc = new ProtectedMethodClass() ;
		System.out.println(pmc.engine1000CC()); // Only public method can be accessed
												// using class instance
		System.out.println(engine2000CC());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engine3000CC();
	}

}
