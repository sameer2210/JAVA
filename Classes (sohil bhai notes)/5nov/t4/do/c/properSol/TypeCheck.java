public class TypeCheck {
	public static void main(String args[]){
	
	Bike b1 = new SisBike();
	
	System.out.println(b1 instanceof Object);		// t all
	System.out.println(b1 instanceof Bike);
	System.out.println(b1 instanceof SisBike);
	System.out.println(b1 instanceof Flyable);
	System.out.println(b1 instanceof Swimmable);
	System.out.println("____________________");
	
	b1 = new BikeType3();
		
		System.out.println(b1);								//BikeType3@15db9742
		System.out.println(b1 instanceof Object);	//t
		System.out.println(b1 instanceof Bike);		//t
		System.out.println(b1 instanceof SisBike);	//f
		System.out.println(b1 instanceof Flyable);	//t
		System.out.println(b1 instanceof Swimmable);	//f
		
			
	}//end main
}//end class