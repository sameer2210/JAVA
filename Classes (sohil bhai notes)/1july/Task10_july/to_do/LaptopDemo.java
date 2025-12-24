public class LaptopDemo{
	public static void main(String args[]){
	Laptop lap = new Laptop();
	System.out.println("__________________________________________________________________________");
	lap.on();
	lap.off();
	lap.on();
	lap.totalRam=4;
	lap.totalRom=64;
	lap.isTouchScreen=true;
	lap.os="Windows xp";
	lap.showInfo();
	
	System.out.println("__________________________________________________________________________");
	lap.off();
	System.out.println("__________________________________________________________________________");
	
	}//end main
}//end class