public class Host extends Human {
	public Host(String name){
		super(name);
	}
	
	void hostingAction(Human guest){
		System.out.println("_____________________________");
		System.out.println("host "+name+ " meet " + guest.name);
		guest.drinkWater();
		guest.eat();
		guest.speak();
		guest.sit();
		
		if(guest instanceof Singer){
			System.out.println(guest.name + " is singer ");
			//Singer singer = guest;
				Singer singer = (Singer) guest;
	singer.sing();
				}
				
		if(guest instanceof Doctor){
			System.out.println(guest.name + " is Doctor ");
			/*Doctor doctor = (Doctor) guest;
			  doctor.checkUp();
			*/
			  ((Doctor)guest).checkUp();
		}
		
		if(guest instanceof Dancer){
			System.out.println(guest.name + " is dancer ");
			((Dancer)guest).dance();
		}
		
		if (guest instanceof Player){
			System.out.println(guest.name + " is player ");
			((Player)guest).play();
		}
		
		if(guest instanceof Painter){
			System.out.println(guest.name + " is painter ");
			((Painter)guest).paint();
		}
		
		if(guest instanceof Trainer){
			System.out.println(guest.name + " is Trainer ");
			((Trainer)guest).motivated();
		}
		
		if(guest instanceof Student){
			System.out.println(guest.name + " is Student ");
			((Student)guest).readAndWrite();
		}
		System.out.println("______________________________________");
	
	}//void
		
		
}//end class