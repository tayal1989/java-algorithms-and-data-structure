package a02.typeconversion;

public class TypePromotion {

	public static void main(String[] args) {
		byte b = 42;  
        char c = 'a';  
        short s = 1024; 
        int i = 97; 
        float f = 5.67f; 
        double d = .1234; 
        
        float floatResult = f * b ;	// Byte is getting promoted to float
        System.out.println("Float Result : " + floatResult);
        
        int intResult = i / c ;	// Char is getting promoted to int
        // Ascii value of a - 97 so it becomes 50000/97
        System.out.println("Int Result : " + intResult);
        
        double doubleResult = d * s ;	// Short is getting promoted to double
        System.out.println("Double Result : " + doubleResult);
          
        // The Expression 
        double result = (f * b) + (i / c) - (d * s); 
          
        //Result after all the promotions are done 
        System.out.println("result = " + result); 

	}

}
