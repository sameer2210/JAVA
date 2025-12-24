public class NitStuUse2 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	try{
		 System.out.println(" enter number ");
		 int num = scan.nextInt();		//java.util.InputMismatchException
		 boolean r = SisUtil.isValidNumberMethod1(num);
		 System.out.println(num + " is valid " + r);
		 
	}catch(Exception e){
		System.out.println("error " + e.getMessage());
	}
		
	}//end main
}//end class