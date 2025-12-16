package e01.constructor;

public class B extends A {
	
	static {
		System.out.println("Static block of B");
	}
	
	public B(String name) {
		System.out.println("In parametrized constructor - B : " + name);
	}	
}
