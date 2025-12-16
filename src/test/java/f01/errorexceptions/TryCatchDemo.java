package f01.errorexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchDemo {
	
	public void fileAccess() {
		FileReader fr = null ;
		try {
			fr = new FileReader("TextFile") ;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Runs for sure");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchDemo tcd = new TryCatchDemo() ;
		tcd.fileAccess();
	}

}
