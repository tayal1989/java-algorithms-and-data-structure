package f01.errorexceptions;

public class ErrorDemo {
	public void method1() {
		this.method2() ;
	}

	public void method2() {
		this.method1();
	}
	
	public static void main(String[] args) {
		ErrorDemo ed = new ErrorDemo() ;
		ed.method1();
	}
}
