public class Test4 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println(" which type object you want to create>> ");
		String bluePrintName = scan.nextLine();
		
		Class c = Class.forName(bluePrintName);		//classNotFoundException
		Object ob = c.newInstance();
		//InstantiationException
		//IllegalAccessException
		
		System.out.println(" created object = " + ob);
			
	
	}//end main
}//end class