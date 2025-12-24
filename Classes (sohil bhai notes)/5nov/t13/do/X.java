import java.io.FileNotFoundException;

public class X {
	
	public static void m1(){
		System.out.println(" x m1 ");
		
		try {
				Y.m2();
		} catch(FileNotFoundException e){
				System.out.println(" part B handled by X" + e.getMessage());
		}
		
	}
}