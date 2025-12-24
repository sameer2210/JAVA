public class TestLoad2{
	public static void main(String args[])throws Exception{
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	java.util.Random rand = new java.util.Random();
		System.out.println(rand);
		// System.out.println(rand.nextLine);
		
		System.out.println(" which class do you want to Load ? ");
		String className = scan.nextLine();
		Class c = Class.forName(className);
		
	
	
	}//end main
}//end class