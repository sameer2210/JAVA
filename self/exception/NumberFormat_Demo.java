// Java program to demonstrate NumberFormatException 
package exception;

public class NumberFormat_Demo {
	public static void main(String[] args) {

	try {
		int num =Integer.parseInt("sameer");
		System.out.println(num);
	}
	catch(NumberFormatException e) {
		System.out.println("no number written write only integerValue");
	}
		
	}
}
