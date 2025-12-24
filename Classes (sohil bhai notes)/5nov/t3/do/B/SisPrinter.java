public class SisPrinter {
	
	public void connect(){
		System.out.println("printer connecting..... ");
		try{Thread.sleep(5000);} catch(Exception e){}
		System.out.println("Printer Connected ..... ");
	}
	public void print(String data){
		System.out.println("printing start...... ");
		try{Thread.sleep(5000);} catch(Exception e){}
		System.out.println("....... printed output bellow ......");
		System.out.println(data);
		System.out.println("----------------------------------\n");
		System.out.println(" printing stop ........ ");
	}
	public void disConnect(){
		System.out.println(" printed disConnecting ..... ");
		try{Thread.sleep(5000);} catch(Exception e){}
		System.out.println("Printer disConnected..... ");
	}
	
	
}//end class