package com.learning.test;

public class Student {
    static int counter = 0;
    int id;
   
    public Student() {
        id = counter;
        counter++;
    }
    
    static public double circleArea (double radius){
    	double first=Math.PI;
    	double second=Math.abs(radius);
    	double third=Math.pow(second, 2);
    	return first*third;
    }
    
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(s1.id + "" + s2.id + "" + s3.id);          
        System.out.println(s1.counter + "" + s2.counter + "" + s3.counter);
        
        String a=new String ("abcdefg");
        String b=new String ("ABCDEFG");
        String c=new String ("AbcdefG");
        String d=new String ("cde");
        System.out.println("First Solution : " + a.equals(b));
        System.out.println("First Solution : " + a.equalsIgnoreCase(b));
        System.out.println("First Solution : " + c.substring(2, 4));
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);
        System.out.println(circleArea(-2));
        
        int x = 20;
        int val = 40 * x++ ;
        x = 20;
        int val1 = 40 * ++x ;
        System.out.println(val);
        System.out.println(val1);
    } 
}
