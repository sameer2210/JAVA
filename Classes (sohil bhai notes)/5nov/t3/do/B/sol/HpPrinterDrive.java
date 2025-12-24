public class HpPrinterDrive extends SisPrinter{

	public void connect(){
		System.out.println("HpPrinterDrive connecting.... ");
	}
	public void disConnect(){
		System.out.println("HpPrinterDriver dis connecting ..... ");
	}
	
	public void print(String data){
		System.out.println("HpPrinterDriver printing ..... ");
		System.out.println("______________________");
		System.out.println(data);
		System.out.println("_______________________");
	}
	
	
}//end calss