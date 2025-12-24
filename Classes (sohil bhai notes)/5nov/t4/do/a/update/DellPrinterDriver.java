public class DellPrinterDriver implements SisPrinter {

@Override
	public void connect(){
		System.out.println("DellPrinterDriver connecting....++++");
	}

@Override
	public void disConnect(){
		System.out.println("DellPrinterDriver dis-connecting....-----");
	}
	
@Override
	public void print(String data){
		System.out.println("DellPrinter printing... ");
		System.out.println("_________________");
		System.out.println(data);
		System.out.println("__________________");
	}
	
	
}//end class