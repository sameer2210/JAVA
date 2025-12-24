public class Saminar {
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
	}else if("yes".equalsIgnoreCase(busAvailable)){
		System.out.println("bus booked......");
	}else{
		System.out.println("nothing booked...");
	}

	System.out.println("******************************************");
	if("yes".equalsIgnoreCase(planeAvailable)){
		System.out.println("booked....");
	}else if("yes".equalsIgnoreCase(trainAvailable)){
		System.out.println("booked....");
	}else if("yes".equalsIgnoreCase(busAvailable)){
		System.out.println("booked...");
	}else{
		System.out.println("nothing booked...");
	}
	
	System.out.println("*******************************************");
	if("yes".equalsIgnoreCase(planeAvailable)
	  ||"yes".equalsIgnoreCase(trainAvailable)
	  ||"yes".equalsIgnoreCase(busAvailable) ){
	
		System.out.println("booked.....");
	}else{
		System.out.println("nothing booked...");
	}
	
	System.out.println("******************************************");
	
	boolean isBooked = false;
	if("yes".equalsIgnoreCase(planeAvailable)
	  ||"yes".equalsIgnoreCase(trainAvailable)
	  ||"yes".equalsIgnoreCase(busAvailable) ){
		isBooked=true;
	}
	System.out.println(isBooked?"Booked":"NOT BOOked");

	System.out.println("********************************************");
	boolean c1="yes".equalsIgnoreCase(planeAvailable);
	boolean c2="yes".equalsIgnoreCase(trainAvailable);
	boolean c3="yes".equalsIgnoreCase(busAvailable);
	boolean isBooked2=c1||c2||c3;
	System.out.println(isBooked2 ? "Booked ":" NOT BOOKED ");
	
	
	System.out.println("*******************************************");
	
	boolean isBooked3="yes".equalsIgnoreCase(planeAvailable)||"yes".equalsIgnoreCase(trainAvailable)||"yes".equalsIgnoreCase(busAvailable);
	System.out.println(isBooked3?"Booked ":" NOT BOOKED");
	






//_________________________________________________________

}
}