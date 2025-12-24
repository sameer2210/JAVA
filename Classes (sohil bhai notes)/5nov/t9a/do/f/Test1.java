public class Test1 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
		System.out.println(" enter number ");
		int num = Integer.parseInt(scan.nextLine());	//No. FormatException
		System.out.println(" your number is " + num);
		// Thread.sleep(1000);		//interrputedException
		System.out.println(" I m happy ");
		
	// int a = Integer.parseInt(" 1000 ");
	// Thread.sleep(5000);
	
	
	}//end main
}//end class