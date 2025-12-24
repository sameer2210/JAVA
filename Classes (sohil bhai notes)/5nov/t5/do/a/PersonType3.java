public class PersonType3
			extends Person
			implements Seeable,Runner,Listener{
				
	@Override
	public void hear(){
		System.out.println(this +" hear .... ");
	}
	
	@Override
	public void run(){
		System.out.println(this + " run... ");
	}
	
	@Override
	public void see(){
		System.out.println(this + " see... ");
	}
	
}//end class