public class PersonType4
			extends Person
			implements Runner,Speaker,Listener{
			
	@Override
	public void hear(){
		System.out.println(this + " hear.... ");
	}
	
	@Override
	public void speak(){
		System.out.println(this + " speak.... ");
	}
	
	@Override
	public void run(){
		System.out.println(this + " run.... " );
	}
	
}//end class