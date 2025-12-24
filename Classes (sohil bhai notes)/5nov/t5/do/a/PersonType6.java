public class PersonType6
			extends Person
			implements Seeable,Runner{

	@Override
	public void run(){
		System.out.println(this + " run.... ");
	}
	
	@Override
	public void see(){
		System.out.println(this + " see..... ");
	}
	
	
}//end class