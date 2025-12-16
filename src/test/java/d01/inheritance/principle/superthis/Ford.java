package d01.inheritance.principle.superthis;

public class Ford extends Car {

	void move() {
		System.out.println("Moves fast - ford");
	}
	
	void moveFast() {
		System.out.println("Ford's own method");
	}
	
	public static void main(String[] args) {
		Ford f = new Ford() ;
		f.move();
		f.moveFast();
	}
}
