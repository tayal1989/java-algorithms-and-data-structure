package c01.non.access.modifiers;

public class StaticMemberClass {
	
	static int val = 10 ;

	public static void main(String[] args) {
		StaticMemberClass smc1 = new StaticMemberClass() ;
		System.out.println(smc1.val);
		StaticMemberClass smc2 = new StaticMemberClass() ;
		smc2.val = 20 ;
		System.out.println(smc1.val + " " + smc2.val);
	}

}
