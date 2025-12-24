public class Car extends Toy implements ElectronicDevice,Repairable {
	
	@Override
	public void move(){
		System.out.println(this + " moving.... ");
	}
	
	@Override
	public void on(){
		System.out.println(this + " on.... ");
	}
	@Override
	public void off(){
		System.out.println(this + " off .... ");
	}
	
	@Override
	public void repair(){
		System.out.println(this + " repair... ");
	}
	
}//end class