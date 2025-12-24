import java.util.Scanner;


public class Req1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		boolean value;
		System.out.println("Enter int value");
		a  = scan.nextInt();//InputMismatchException
		System.out.println("enter boolean value");
		value  = scan.nextBoolean();//InputMismatchException
		System.out.println("a "+ a);
		System.out.println("boolean value  "+ value);
		
		
		

	}//end main

}//end class
