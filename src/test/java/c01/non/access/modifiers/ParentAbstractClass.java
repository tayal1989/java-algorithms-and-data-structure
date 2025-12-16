package c01.non.access.modifiers;

// public final abstract class ParentAbstractClass {
// A class can be abstract without any abstract methods in it
public abstract class ParentAbstractClass {

	public abstract void move() ;
//	public final abstract void move() ; // Cannot be final, strictfp or static
//	public static abstract void move() ;
//	public strictfp abstract void move() ;
	
	public void withoutAbstractMethod() {
		System.out.println("This method shows that we can create a non-abstract method "
				+ "inside abstract class");		
	}
}
