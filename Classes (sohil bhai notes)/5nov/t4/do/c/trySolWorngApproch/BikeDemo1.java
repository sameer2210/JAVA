public class BikeDemo1 {
	public static void main(String args[]){
	
	Bike b1 = new BikeType1();
		b1.fillFuel(5L);
		b1.start();
		b1.run();
		b1.brake();
		b1.stop();
		b1.swim();
		b1.fly();
		System.out.println("_________________");
		
		Bike b2 = new BikeType2();
		b2.fillFuel(7L);
		b2.start();
		b2.run();
		b2.brake();
		b2.stop();
			
	
	}//end main
}//end class