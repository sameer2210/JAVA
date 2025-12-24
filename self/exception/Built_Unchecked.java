// arithameticException
package exception;

public class Built_Unchecked {

	public static void main(String[] args) {

		System.out.println(" 1 before try ");
	try {
		System.out.println(" 2 after try ");
		int a = 100,b=2,c;		// if b=0 ?
		
		System.out.println(" 3 after a&b ");
		c=a/b;
		System.out.println(" 4 before c execute ");
		System.out.println(c);
		System.out.println(" 5 after c executed ");
	}
	catch(ArithmeticException e) {
	
		System.out.println(" 6 can not divide by zero");
		
		e.printStackTrace();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.getMessage());
		
		System.out.println(" 7 after e ");
	}
	System.out.println(" 8 over ");
	}

}
