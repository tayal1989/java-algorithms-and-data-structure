package b01.accessmodifier.first.pkg;

public class CallingProtectedMember {
	
	void sampleMethod() {
		// super can be used with protected member in another pkg
		// not in same package
		// System.out.println(super.speed);
	}

	public static void main(String[] args) {
		ProtectedMemberClass pmc = new ProtectedMemberClass() ;
		System.out.println(pmc.speed) ;
	}

}
