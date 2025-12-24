

public class BikeType3 extends Bike  implements Flyable{

	@Override
	public void brake() {
		System.out.println(this  +" has Disk Brake******");
	}

	@Override
	public void fly() {
		System.out.println(this  +" flying..$$$");
	}

}
