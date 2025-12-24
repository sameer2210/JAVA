public class PersonType2
			extends Person
			implements Seeable,Runner,Speaker{
			
	@Override
	public void speak(){
		System.out.println(this + " speak.... ");
	}
	
	@Override
	public void run(){
		System.out.println(this + " run...  ");
	}
	
	@Override
	public void see(){
		System.out.println(this + " see..... ");
	}
	
}//end class