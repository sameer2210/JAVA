public class My{
	public static void main(String args[]){
	
	String planeAvailable=null;
	String trainAvailable=null;
	String busAvailable=null;
	java.util.Scanner scan = new java.util.Scanner(System.in);
	
	System.out.println("is plane available ? yes/no");
	planeAvailable=scan.nextLine();
	
	System.out.println("is train available ? yes/no");
	trainAvailable=scan.nextLine();
	
	System.out.println("is bus available ? yes/no");
	busAvailable=scan.nextLine();
	
	// if("yes".equals(planeAvailable)){

	if("yes".equalsIgnoreCase(planeAvailable)){
		System.out.println("plane booked.....");
	}else if("yes".equalsIgnoreCase(trainAvailable)){
		System.out.println("train booked.....");
	}else if("yes".equalsIgnoreCase(busAvailable));{
		System.out.println("bus booked......");
	}else if("no".equalsIgnoreCase(busAvailable)){
		System.out.println("nothing booked...");
	 }
}//end class
}//end class