public class ToyDemo1 {
	public static void main(String args[]){

	Toy toyList[] = {
							new Gun(),
							new Doll(),
							new Aeroplan(),
							new Car(),
							new BowAndArrow(),
							new Mobile(),
							new BatAndBall(),
							new Ball(),
							new TeddyBear(),
	};
	
	for(Toy toy : toyList){
			System.out.println(toy);
			if(toy instanceof Danger){
				System.out.println(" this is Danger, not for child " );
			}
			if(toy instanceof Washable){
				System.out.println(" you can wash ");
			}
			if(toy instanceof Repairable){
				System.out.println(" you can repair it ");
			}
			if(toy instanceof ElectronicDevice){
				System.out.println(" you can on and off ,it is e-device ");
			}
			
			System.out.println("___________________");
	}//for

	}//end main
}//end class
