
public class DellPrinterDrive extends SisPrinter {

@Override
	public void connect(){
		System.out.println("DellPrinterDerive connecting.... ");
	}
@Override
	public void disConnect(){
		System.out.println("DellPrinterDrive dis connnecting .... ");
	}

@Override
	public void print(String data){
		System.out.println("DellPrinter printing... ");
		System.out.println("_________________");
		System.out.println(data);
		System.out.println("__________________");
	}
	
}//end class	