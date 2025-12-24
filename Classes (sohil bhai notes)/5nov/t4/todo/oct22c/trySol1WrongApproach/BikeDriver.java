
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
			
	    //can not recoginized swim or fly
  /* 
			if(givenBike instanceof Swimmable){
			  swim
			}
			if(givenBike instanceof Flyable){
               fly
			} */
		
		System.out.println("_________________");
	}


}
