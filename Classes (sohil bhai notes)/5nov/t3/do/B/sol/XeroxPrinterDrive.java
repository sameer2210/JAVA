
public class XeroxPrinterDrive extends SisPrinter {
	
	public void connect(){
		System.out.println("XeroxPrinterDrive connnecting .... ");
	}
	public void disConnect(){
		System.out.println("XeroxPrinterDrive disconnecting.... ");
	}
	
	public void print(String data){
		System.out.println("XeroxPrinterDirive printing.... ");
		System.out.println("_________________________");
		System.out.println(data);
		System.out.println("__________________________");
	}
	
}//end class