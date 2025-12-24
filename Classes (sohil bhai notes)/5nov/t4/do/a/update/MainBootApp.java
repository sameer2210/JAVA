public class MainBootApp {
	public static void main(String args[])throws Exception{
	
	System.out.println("bios start.... ");
	SisOs os = new SisOs();
	os.on();
	System.out.println("_________________");
	os.printService();
	System.out.println("_________________");
	os.shutDown();
	
	
	}//end main
}//end class