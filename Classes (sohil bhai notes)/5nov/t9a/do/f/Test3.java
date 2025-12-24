public class Test3 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	try{ 
		 System.out.println(" enter number ");
		 int num = Integer.parseInt(scan.nextLine());
		 System.out.println(" your number is " + num);
	}catch(NumberFormatException e){
		System.out.println(" error must enter int number ");
	}
	
	try{
			Thread.sleep(2000);
			System.out.println(" I m happy ");
	}catch(InterruptedException e){
			System.out.println(" Error : " + e.getMessage());
	}	
	
	}//end main
}//end class


