package d01.inheritance.principle.superthis;

public class BMW extends Car {

	public static void main(String[] args) {
		Ford f = new Ford() ;
		BMW b = new BMW() ;
		Car c = new Car() ;
		
		System.out.println(f instanceof Car);
		System.out.println(b instanceof Car);
		System.out.println(c instanceof Car);
		// System.out.println(f instanceof BMW); // Ford and BMW are incompatible
		// System.out.println(b instanceof Ford); // Ford and BMW are incompatible
		System.out.println(c instanceof Ford);
	}
}
