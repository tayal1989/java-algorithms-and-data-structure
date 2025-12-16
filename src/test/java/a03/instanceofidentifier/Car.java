package a03.instanceofidentifier;

public class Car implements Vehicle {
	int speed ;

	public static void main(String[] args) {
		Car a = new Car() ;
		Car b = a ;
		
		if(b == a) {
			System.out.println("Both the reference have same memory address");
		}
		
		if(a instanceof Car) {
			System.out.println("Object a is instance of Car class");
		}
		
		if(a instanceof Vehicle) {
			System.out.println("Object a is instance of Vehicle interface");
		}
		
		if(b instanceof Car) {
			System.out.println("Object b is instance of Car class");
		}
		
		if(b instanceof Vehicle) {
			System.out.println("Object b is instance of Vehicle interface");
		}
		
		a.speed = 20 ;
		System.out.println(a.speed + " " + b.speed);
		b.speed = 40 ;
		System.out.println(a.speed + " " + b.speed);
	}
}
