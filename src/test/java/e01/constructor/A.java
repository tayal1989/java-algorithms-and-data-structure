package e01.constructor;

public class A {
	
	static {
		System.out.println("Static block of A");
	}

	public A() {
		System.out.println("In default constructor - A");
	}
	
	public A(String name) {
		System.out.println("In parametrized constructor - A : " + name);
	}
}
