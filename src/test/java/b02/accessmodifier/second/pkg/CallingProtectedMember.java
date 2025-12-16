package b02.accessmodifier.second.pkg;

import b01.accessmodifier.first.pkg.ProtectedMemberClass;

public class CallingProtectedMember extends ProtectedMemberClass{
	
	void sampleMethod() {
		ProtectedMemberClass pmc = new ProtectedMemberClass() ;
		// System.out.println(pmc.speed) ; // This will not work as class object 
										// cannot call protected members 
		System.out.println(super.speed);
	}

	public static void main(String[] args) {
		CallingProtectedMember cpm = new CallingProtectedMember() ;
		cpm.sampleMethod();
	}

}
