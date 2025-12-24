public class Demo3 {
	public static void main(String args[]){
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
		int a;
		int b;
		int div;
		
	try{ 
			System.out.println(" enter a ");
			a = scan.nextInt();						//intput Mismatch Exception
			System.out.println(" enter b ");
			b = scan.nextInt();						//intput Mismatch Exception
			div = a/b;										//java.lang.Arthmatic Exception : / by zero			
			System.out.println(" div = " + div);	//int //int = Int
			
	}catch(java.util.InputMismatchException e){
			System.out.println("Error : invalid int entered.... ");
	}catch(ArithmeticException e){
			System.out.println("Error msg : " + e.getMessage());
			System.out.println("Error msg : b value must not be zero ");
	}catch(Exception e) {
			System.out.println(" other Error msg : " + e.getMessage());
	}	
	
	}//end MAIN
}//end class