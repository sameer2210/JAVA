public class Laptop{
	int totalRam;
	int totalRom;
	boolean isTouchScreen;
	String os;
	
	void on(){
		System.out.println("Laptop on..........");
	}
	
	void off(){
		System.out.println("Laptop off..........");
	}
		
	void showInfo(){
	System.out.println("___________________________Laptop - info________________________________");
	System.out.println("Total ram : "+totalRam);
	System.out.println("Total rom : "+totalRom);
	System.out.println("Screen touch : "+isTouchScreen);
	System.out.println("Operating system : "+os);
	
	}
	
	
	
	
}//end class