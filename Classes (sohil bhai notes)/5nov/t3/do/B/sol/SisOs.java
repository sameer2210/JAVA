public class SisOs {

	public void on(){
		bootingAndLoadingOs();
		System.out.println(" init Os Software ");
		try{ Thread.sleep(2000);} catch(Exception e){}
		//start .... System
		System.out.println("Strat... Os ready for use ");
		try{ Thread.sleep(1000);} catch (Exception e){}
	}
	
	private void bootingAndLoadingOs(){
		System.out.println("loading .... system file into Ram ");
		try{ Thread.sleep(1000);} catch (Exception e){}
	}
	
	public void shutDown(){
		System.out.println("closing os System sw... ");
		try{ Thread.sleep(1000);} catch(Exception e){}
		System.out.println("closing device system PC ");
		try{ Thread.sleep(1000);} catch(Exception e){}
		System.out.println("shut down finish ");
	}
	
	//kb service mouse service... 
	//printer service
	
	public void printService() throws Exception{
	
	java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("enter printer type ");
		String className = scan.nextLine();
		Class c = Class.forName(className);
		Object obj = c.newInstance();
	
		if(obj instanceof SisPrinter) {
			SisPrinter printer = (SisPrinter)obj; //Dell,Hp,Sony Xerox
			printer.connect();
			printer.print("Success is sure if sure if I want ... ");
			printer.disConnect();
		}else{
			System.out.println("invalid printer driver "+c);
		}
	}
	
}//end class		
		