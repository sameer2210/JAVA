public class NitStuUse4 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	try{
		 System.out.println(" enter Number ");
		 int num=scan.nextInt(); 	//java.util.InputMismatchException
		 boolean r = SisUtil.isValidNumberMethod2(num);
		 System.out.println(num + " is valid " + r);
		 
	}catch(NumberRangeException e){
		System.out.println(" Range Error " + e.getMessage());
	}catch(Exception e){
		System.out.println(" Error : " + e.getMessage());
	}
		
	}//end main
}//end class