package a02.typeconversion;

public class Explicit {

	public static void main(String[] args) {
		short s = 234 ;
		// byte b = s ; // Type mismatch : cannot convert from short to byte
		byte b = (byte) s ;	 // Explicit mention cast
		System.out.println(b); // Still value will be -22 -> 234 % 256 = -22
		
		int i = 100000 ;
		s = (short) i ;
		System.out.println(s); // Value will be -31072
		
		// Narrowing or explicit conversion
        i = 257;  
        double d = 323.142; 
        System.out.println("Conversion of int to byte.");  
          
        //i%256 
        b = (byte) i;  
        System.out.println("i = " + i + " b = " + b); 
        System.out.println("\nConversion of double to byte."); 
          
        //d%256 
        b = (byte) d;  
        System.out.println("d = " + d + " b= " + b);
	}

}
