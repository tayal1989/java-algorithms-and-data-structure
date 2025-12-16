package interfaces.and.abstracts.interview.question;

public class ImportingOneTwoInterface implements One, Two {
	
	public void method() {
		
	}

	public static void main(String[] args) {
		System.out.println(One.x);
		System.out.println(Two.x);
	}
}
