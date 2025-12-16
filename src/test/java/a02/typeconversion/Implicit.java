package a02.typeconversion;

public class Implicit {

	public static void main(String[] args) {
		// byte -> short -> int -> long (implicit)
		byte c = 120 ;
		short s = c ;		
		System.out.println(s);
		
		int i = s ;
		System.out.println(i);
		
		long l = i ;
		System.out.println(l);
	}

}
