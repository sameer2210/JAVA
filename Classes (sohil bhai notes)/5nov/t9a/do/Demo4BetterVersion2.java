public class Demo4BetterVersion2 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("which type object you want to create >> ");
	String bluePrintName = scan.nextLine();
	
	try{
		 Class c = Class.forName(bluePrintName);
		 Object ob = c.newInstance();
		 System.out.println("created object = " + ob);
		
	}catch(ClassNotFoundException e){
		System.out.println("Error : give type " + bluePrintName + " not exist ");
	}catch(InstantiationException e){
		System.out.println(" Error : give type " + bluePrintName +" Must not be interface or abstract class Or class must have default constructor ");
	}catch(IllegalAccessException e){
		System.out.println(" Error : can not create object of " + bluePrintName +" because : it has private constructor ");
	}catch(Exception e){
		System.out.println(" Error : " + e.getMessage());
	}
		
	}//end main
}//end class