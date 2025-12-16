package e01.constructor;

public class ThisExample {

	int price ;
	int speed ;
	
	public ThisExample() {
		this.price = 5000 ;
	}
	
	public ThisExample(int speed) {
		this() ;
		this.speed = speed ;
	}
}
