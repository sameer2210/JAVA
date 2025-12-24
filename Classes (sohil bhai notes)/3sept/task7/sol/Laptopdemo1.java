public class Laptopdemo1{
	public static void main(String args[]){
	
	Laptop l1 = new Laptop();
	
	System.out.println("processorType " + l1.processorType);
	System.out.println("Ram " + l1.totalRam);
	System.out.println("Rom " + l1.toalRom);
	System.out.println("os " + l1.os);
	System.out.println("____________________________");
	
		l1.processorType="i11";
		l1.totalRam=16;
		l1.totalRom=512;
		l1.os="Windows11";
		
	System.out.println("_____________________________");
	System.out.println("processorType" + l1.processorType);
	System.out.println("Ram " + l1.totalRam);
	System.out.println("Rom " + l1.totalRom);
	System.out.println("os " + l1.os);
	System.out.println("______________________________");
	
	l1.on();
	l1.off();
	
	
	}//end main
}//end class