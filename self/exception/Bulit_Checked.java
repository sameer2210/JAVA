// FileInputStream

package exception;
import java.io.File;
import java.io.FileInputStream;

public class Bulit_Checked {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("E:/java_notes/try/1/A.txt");
			System.out.println("your file is ready");
		}
		catch(Exception e){
			System.out.println("your file not found");
			System.out.println(e);
		}
		
	}

}
