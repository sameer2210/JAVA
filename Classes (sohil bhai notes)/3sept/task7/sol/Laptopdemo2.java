public class Laptopdemo2{
	public static void main(String args[]){
	
	Laptop l1 = new Laptop();
	
		l1.setProcessorType("i11");
		l1.setTotalRam(16);
		l1.setTotalRom(512);
		l1.setOs("Windows11");
		
		System.out.println("_________________________");
		System.out.println("processorType " + l1.getProcessorType());
		System.out.println("Ram " + l1.getTotalRam());
		System.out.println("Rom " + l1.getTotalRom());
		System.out.println("os " + l1.getOs());
	
	
		l1.on();
		l1.off();
			
	
	}//end main
}//end class