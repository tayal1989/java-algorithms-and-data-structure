package interfaces.and.abstracts.interview.question;

/**
 * <h1>FinalClass.java</h1>
 * The FinalClass.java program implements an application that
 * 
 * <p>
 * Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 *
 * @author	Vishal Agarwal
 * @version	1.0
 * @date		05-Dec-2016
 */

public abstract class FinalClass implements SecondClass {

	public void area() {
		System.out.println("Method from FirstClass but inside FinalClass");
	}

	public void perimeter() {
		System.out.println("Method from SecondClass but inside FinalClass");
	}

}
