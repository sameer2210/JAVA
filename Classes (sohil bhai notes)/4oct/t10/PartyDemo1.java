public class PartyDemo1 {

	public static void main(String args[] )throws Exception{
	Human gestList[]={
					  new Human("sameer"),
					  new Student("Aayush"),
					  new Trainer("babu bhaiye "),
					  new Human(" riya "),
					  new Singer(" puja "),
					  new Student(" rohit "),
					  new Dancer(" kuldeep "),
					  new Singer(" ziyaan "),
					  new Player(" piyush "),
					  new Dancer(" shriram "),
					  new Painter(" saniya "),
	};
	
	System.out.println("total guest = "+ gestList.length);
	
	Host host = new Host("Kallu ");
	for(Human g : gestList){
		Thread.sleep(2000);
		host.hostingAction(g);
	}
	
	}//end main
	
}//end class
	
	