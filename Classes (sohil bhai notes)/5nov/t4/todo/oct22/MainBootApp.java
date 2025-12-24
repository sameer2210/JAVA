
public class MainBootApp {

	public static void main(String[] args) throws Exception{
	 System.out.println("bios start.....");
	 SisOs os  = new SisOs();
	 os.on();
	 System.out.println("++++++++++++++++++++");
	 os.printService();
	 System.out.println("++++++++++++++++++++");
	 os.shutDown();
	 

	}

}
