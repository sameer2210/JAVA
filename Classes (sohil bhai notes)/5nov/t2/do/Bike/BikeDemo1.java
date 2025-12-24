public class BikeDemo1 {
	public static void main(String args[]){
	
	//Bike bike = new Bike();
		Bike bike1 = new Pulsar();
		Bike bike2 = new Passionpro();
		bike1.fillFuel();
		bike1.start();
		bike1.run();
		bike1.brake();
		bike1.stop();
		System.out.println("___________________");
	
	bike2.fillFuel();
		bike2.start();
		bike2.run();
		bike2.brake();
		bike2.stop();
		
	}//end main
}//end class