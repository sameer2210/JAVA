import java.io.FileNotFoundException;


public class Z {

	public static void m3() throws FileNotFoundException{
		System.out.println("z m3");
		if(true){
			throw new FileNotFoundException("abc.jpg file NOT FOUND");
		}
		
	}

}
