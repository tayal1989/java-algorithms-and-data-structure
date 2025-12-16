package b02.accessmodifier.second.pkg;

public class CallingDefaultClass {

	void calculateHomeLoan() {
		// Not working as default classes cannot be called outside the package
		// InterestRateDefaultAM irdam = new InterestRateDefaultAM() ;
	}
}
