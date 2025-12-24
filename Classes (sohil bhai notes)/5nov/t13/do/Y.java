import java.io.FileNotFoundException;

public class Y {
	public static void m2() throws FileNotFoundException {
		System.out.println(" y m2 ");
	
		try {
				Z.m3();
		}catch(FileNotFoundException e){
			System.out.println(" Y handle Part A " + e.getMessage());
				// rethrow 
				throw e;
		}
	}
	
}//end class