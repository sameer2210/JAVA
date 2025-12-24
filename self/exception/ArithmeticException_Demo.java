// demonstrate of Arithmetic Exception
package exception;

public class ArithmeticException_Demo{
	public static void main(String[] args) {

		int a=10,b=0,c;
		
	try {
		c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e){
		System.out.println("you can not divide by zero ");
		e.printStackTrace();
	}
		
	}
}
