// Java program to demonstrate StringIndexOutOfBoundsException 
package exception;
public class StringIndexOutOfBonds_demo {

	public static void main(String[] args) {

		String str = "sameer know java";
		
	try {
		char c = str.charAt(20);
		System.out.println(c);
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println("their is not a char at this place ");
		System.out.println("select string index only ");
	}
		
	}
}
