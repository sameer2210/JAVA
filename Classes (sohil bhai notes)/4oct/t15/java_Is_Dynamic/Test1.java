public class Test1{
	public static void main(String args[])throws Exception {
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("which class do you want to load and create object ? ");
	String className = scan.nextLine();
	System.out.println("__________________________________________\n");
	
	Class c = Class.forName(className);		//load class/BluePrint
	System.out.println("________________________");
	
	Object obj = c.newInstance();		//creat object
	System.out.println("_______________________");
	
	System.out.println("obj = " + obj);
	
	}//end main
}//end class