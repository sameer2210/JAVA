
public class NitStuUse3 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println(" enter number ");
		int num = scan.nextInt();	//java.utlil.InputMismatchException
		boolean r = SisUtil.isValidNumberMethod2(num);
		System.out.println(num + " is valid " + r);
		
	
	}//end main
}//end class