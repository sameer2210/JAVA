public class Test2 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println(" enter number ");
		int num = Integer.parseInt(scan.nextLine());	//No. FormatException
		System.out.println(" your number is " + num);
		
	try{
		 Thread.sleep(2000);		//InteruptedException
		 System.out.println(" I m happy ");
	}catch(InterruptedException e){
			System.out.println(" Error : " + e.getMessage());
	}
	
	
	}//end main
}//end class