package a01.defaultvalues.basic.concepts;

public class MemorySharing {
	private int a;
	public double b;

	public MemorySharing(int first, double second) {
		this.a = first;
		this.b = second;
	}

	public static void main(String[] args) {
		MemorySharing c1 = new MemorySharing(10, 20.5);
		MemorySharing c2 = new MemorySharing(10, 31.5);
		c2 = c1;
		System.out.println(c1.a + " --> " + c1.b);
		System.out.println(c2.a + " --> " + c2.b);
		c1.a = 2;
		System.out.println(c1.a + " --> " + c1.b);
		System.out.println(c2.a + " --> " + c2.b);
	}
}
