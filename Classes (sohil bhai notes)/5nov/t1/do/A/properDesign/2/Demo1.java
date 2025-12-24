
public class Demo1 {
	public static void main(String args[]){

		//Laptop laptop1 = new LaptopType1();
		
	Laptop laptop1 = new LaptopType1();
	Laptop laptop2 = new LaptopType2();
	Laptop laptop3 = new LaptopType3();
	
		laptop1.installOs();
		laptop2.installOs();
		laptop3.installOs();
		laptop1.installRam();
		laptop2.installRam();
		laptop3.installRam();
		laptop1.setHarDisk();
		laptop2.setHarDisk();
		laptop3.setHarDisk();
		
		laptop1.on();
		laptop2.on();
		laptop3.on();
		System.out.println("_________________________");
		
		laptop1.showDetails();
		laptop2.showDetails();
		laptop3.showDetails();
		
	
	}//end main
}//end class