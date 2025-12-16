package e01.constructor;

public class ParametrizedConstructor {
	int price ;
	int maxSpeed ;
	
	public ParametrizedConstructor(int p, int m) {
		price = p ;
		maxSpeed = m ;
	}

	public static void main(String[] args) {
		ParametrizedConstructor c = new ParametrizedConstructor(5000, 120) ;
		ParametrizedConstructor d = new ParametrizedConstructor(2000, 60) ;
		// ParametrizedConstructor e = new ParametrizedConstructor() ; // As there is no constructor based on arguments,
							// this will throw error
	}

}
