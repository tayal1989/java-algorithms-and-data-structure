package c01.non.access.modifiers;

public class StrictFPExample {
    // calculating sum using strictfp modifier 
    public strictfp double sum() 
    { 
        double num1 = 10e+10; 
  
        double num2 = 6e+08; 
  
        return (num1+num2); 
  
    } 
  
    public static strictfp void main(String[] args) 
    { 
        StrictFPExample t = new StrictFPExample(); 
  
        System.out.println(t.sum()); 
    } 
}
