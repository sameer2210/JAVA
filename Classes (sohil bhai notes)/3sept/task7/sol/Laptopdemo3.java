public class Laptopdemo3{
	public static void main(String args[])throws Exception{
	
	Laptop l1 = new Laptop();
	
		l1.setProcessorType("i11");
		l1.setTotalRam(12);
		l1.setTotalRom(512);
		l1.setOs("Window");
		
	System.out.println("______________________________");
	Thread.sleep(1000);
	System.out.println("ProcessorType " + l1.getProcessorType());
	Thread.sleep(1000);
	System.out.println("Ram " + l1.getTotalRam());
	Thread.sleep(1000);
	System.out.println("Rom " + l1.getTotalRom());
	Thread.sleep(1000);
	System.out.println("os " + l1.getOs());
	
	l1.on();
	l1.off();
	
	
	
	}//end main
}//end class