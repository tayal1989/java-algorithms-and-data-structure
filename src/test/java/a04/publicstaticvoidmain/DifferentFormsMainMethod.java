package a04.publicstaticvoidmain;

public class DifferentFormsMainMethod {

//	public static void main(String[] args) { // Works fine
//	static public void main(String[] args) { // Works fine	
//	public static void main(String []args) { // Works fine
//	public static void main(String args[]) { // Works fine
//	public static void Main(String args[]) { // don't Works fine as main is Main
	public static void main(String... args) { // Compulsory 3 dots
		System.out.println("Hello World");
	}
}
