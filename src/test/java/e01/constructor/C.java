package e01.constructor;

public class C extends B {
	
	public C() {
		super("Bimla from C") ;
		System.out.println("In default constructor - C");
	}
	
	public C(String name) {
		super("Bimla from C - para") ;
		System.out.println("In parametrized constructor - C : " + name);
	}
}
