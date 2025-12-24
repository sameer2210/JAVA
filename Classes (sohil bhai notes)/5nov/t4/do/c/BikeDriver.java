public class BikeDriver {

	private String name;
	public BikeDriver(String name){
		this.name = name;
	}
	
	public void drive(Bike givenBike){
		System.out.println(name + " got a bike " + givenBike);
		givenBike.fillFuel(5);
		givenBike.start();
		givenBike.run();
		givenBike.brake();
		givenBike.stop();
		
	//can not recoginiced swim or fly
		
		System.out.println("____________________");
	
	}
	
}//end class
		