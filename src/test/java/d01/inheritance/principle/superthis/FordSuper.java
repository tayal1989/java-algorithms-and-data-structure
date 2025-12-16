package d01.inheritance.principle.superthis;

public class FordSuper extends Car {
	int speed = 40 ;
	
	void move() {
		System.out.println(super.speed);
		System.out.println(this.speed);
	}

	public static void main(String[] args) {
		FordSuper fs = new FordSuper() ;
		fs.move() ;
	}

}
