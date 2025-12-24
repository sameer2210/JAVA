public class PersonType1
			extends Person
			implements Seeable,Runner,Speaker,Listener{
			
	@Override
	public void hear(){
		System.out.println(this + " hear..... " );
	}
	
	@Override 
	public void speak(){
		System.out.println(this + " speak.... ");
	}
	
	@Override 
	public void run(){
		System.out.println(this + " run .... ");
	}
	
	@Override
	public void see(){
		System.out.println(this + " see..... ");
	}
	
}//end class