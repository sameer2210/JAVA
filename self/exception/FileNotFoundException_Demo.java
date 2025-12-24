// demonstrate FileNotFound Exception 
package exception;
import java.io.*;		//(or)
	//import java.io.File;
	//import java.io.FileReader;
	//import java.io.FileNotFoundException;

public class FileNotFoundException_Demo {

	public static void main(String[] args) {

	try {
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file);
	}
	catch(FileNotFoundException e) {
		System.out.println("there is no file available");
	}
		
	}
}
