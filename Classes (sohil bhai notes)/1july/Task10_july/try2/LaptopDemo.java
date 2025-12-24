public class LaptopDemo {
	public static void main(String [] args){
	
	Laptop lap = new Laptop();
	System.out.println("____________________");
	lap.on();
	lap.off();
	lap.on();
	lap.totalRam=4;
	lap.totalRom=64;
	lap.isTouchScreen=true;
 	lap.os="Windows xp";
	
	System.out.println("____***********______");
	lap.showInfo();
	
	System.out.println("____________________");
	System.out.println("____________________");

	}
}