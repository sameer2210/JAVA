	
public class Demo4BetterVersion1 {
	public static void main(String args[]){
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println(" which type object you want to create>> ");
	String bluePrintName = scan.nextLine();
	
	try{
		 Class c = Class.forName(bluePrintName);	//class loaded...java.lang.ClassNotFoundException
		 Object ob = c.newInstance();		//java.lang.InstantiationException(interface or abstract class, if class has not present default constructor )
		 System.out.println(" created object = " + ob );
	}catch(Exception e){
			System.out.println(" Error : " + e.getMessage());
	}
		
	
	}//end main
}//end class