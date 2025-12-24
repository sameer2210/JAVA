
public class HpPrinterDriver implements SisPrinter{
	public void connect(){
		System.out.println("HpPrinterDriver connecting.... +++");
	}
	public void disConnect(){
		System.out.println("HpPrinterDriver dis-connect.... ----");
	}
	
	public void print(String data){
		System.out.println("HPPrinterDeriver Printing..... ");
		System.out.println(".................................... ");
		System.out.println(data);
		System.out.println(".................................... ");
		
	}
	
	
}//end class