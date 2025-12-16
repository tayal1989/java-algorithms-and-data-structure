package c01.non.access.modifiers;

public class CallingAbstractClass extends ParentAbstractClass {

	@Override
	public void move() {
		System.out.println("In child class");		
	}

	public static void main(String[] args) {
		// ParentAbstractClass pac = new ParentAbstractClass() ;
		CallingAbstractClass cac = new CallingAbstractClass() ;
		cac.move();
	}
}
