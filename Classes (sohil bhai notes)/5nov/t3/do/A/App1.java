public class App1 {
	public static void main(String args[])throws Exception {
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("enter class for create & use object ");
	String className  = scan.nextLine();
		Class c = Class.forName(className);
		Object obj = c.newInstance();
		
		if (obj instanceof X){
			X ref = (X) obj;
			ref.mySpecialMethodNumber1();
			ref.mySpecialMethodNumber2();
			ref.mySpecialMethodNumber3();
		} 
		
	}//end main
}//end class