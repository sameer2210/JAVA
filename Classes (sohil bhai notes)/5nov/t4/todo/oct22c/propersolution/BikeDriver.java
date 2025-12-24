			
public class BikeDriver {

	private String name;

	public BikeDriver(String name) {
		this.name=name;
	}

	public void drive(Bike givenBike) {
		System.out.println(name  +" got a bike "+ givenBike);
					givenBike.fillFuel(5);
					givenBike.start();
					givenBike.run();
					givenBike.brake();
					givenBike.stop();
	 
	 
	    if(givenBike instanceof Swimmable){
		 System.out.println(givenBike +" can swim^^^^^^^^^^^^^^^^^^^");
		 //CTE givenBike.swim();
		 Swimmable swimmableBike  =(Swimmable) givenBike;
		 swimmableBike.swim();
		}
		
		
	    if(givenBike instanceof Flyable){
		 System.out.println(givenBike +" can fly^^^^^^^^^^^^^^^^^^^");
		 //CTE givenBike.fly();
		 Flyable flyableBike  = (Flyable)givenBike;
		 flyableBike.fly();
		}
		System.out.println("_________________");
	}


}
