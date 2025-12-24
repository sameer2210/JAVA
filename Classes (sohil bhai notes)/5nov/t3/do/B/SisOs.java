public class SisOs {
	
	public void on(){
		bootingAndLoadingOs();
		System.out.println("init os software ");
		try{Thread.sleep(2000);} catch(Exception e){}
		// start.... system
		System.out.println("Start.... Os ready for use");
		try{ Thread.sleep(1000);} catch(Exception e){}
	}

	private void bootingAndLoadingOs(){
		System.out.println(" Loading .... system file into Ram ");
		try {Thread.sleep(2000);} catch(Exception e){}
	}
	
	public void shutDown(){
		System.out.println("closing os system sw... ");
		try{Thread.sleep(1000);} catch(Exception e){}
		System.out.println("closing device System PC ");
		try{Thread.sleep(1000);} catch(Exception e){}
		System.out.println("shut down finish ...... ");
	}
	
	//kb service mouse service....
	//printer service
	
	public void printService(){
		//printer connect
		//print
		//printer disconect
		SisPrinter printer = new SisPrinter();
		printer.connect();
		//text data
		printer.print(" Success is sure if I  Want... ");
		//text data
		printer.print("I am sw engineer ");
		
		printer.disConnect();
	}//end void
	
	
}//end class