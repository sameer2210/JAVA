
public class BikeDemo2 {

	public static void main(String[] args) {
		 
		Bike myBikes[]  ={
				new BikeType1(),
				new BikeType2(),
				new BikeType3(),
				new BikeType4(),
				new SisBike(),
		};
		
		BikeDriver myStudent  = new BikeDriver("anjali");
		
		for (Bike bike : myBikes) {
		try{ Thread.sleep(2000); } catch(Exception e){}
			myStudent.drive(bike);
		}
		
		
		
		
		
		
		 
	}

}
