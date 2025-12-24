// demonstrate arrayIndexOutOfBounds Exception 
package exception;

public class ArrayIndexOutOfBound_Demo {
	public static void main(String[] args) {

	try {
		int a[]= new int[5];
		a[6] = 22;
		System.out.println(a);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("out of array limit");
	}
		
	}

}
