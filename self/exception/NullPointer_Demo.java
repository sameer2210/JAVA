// demostratetion of NullPointer Exception
package exception;

public class NullPointer_Demo {

	public static void main(String[] args) {

		String str= null;
	try {
		System.out.println(str.charAt(0));
	}
	catch(NullPointerException e) {
		System.out.println(" string value is null ");
		System.out.println(e);
	}
		
		
	}

}
