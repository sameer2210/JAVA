
public class PartyDemo1 {

	public static void main(String[] args) throws Exception {
	Human gestList[]={
			new Human("raju"),
			new Student("Gagan"),
			new Trainer("Surendra"),
			new Human("suresh"),
			new Singer("sonu Nigam"),
			new Student("Keshari"),
			new Dancer("Mithun"),
			new Singer("Darshan Rawal"),
			new Player("Dhoni"),
			new Dancer("Raghav"),
			new Painter("Gita"),
	};
	
	System.out.println("total gest = "+ gestList.length);
	
	Host host  = new Host("Karan");
	
	for (Human g : gestList) {
		Thread.sleep(1000);
		host.hostingAction(g);
	}	
	}

}
