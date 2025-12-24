public class BikeDemo2 {
	public static void main(String args[]){
	
	Bike myBike[] = {
								new BikeType1(),
								new BikeType2(),
								new BikeType3(),
								new BikeType4(),
								new SisBike(),
							};
	
	BikeDriver myStudent = new BikeDriver(" anjali ");
		for (Bike bike : myBike) {
			myStudent.drive(bike);
		}
	
		
	}//end main
}//end class