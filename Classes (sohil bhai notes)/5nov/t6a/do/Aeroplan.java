
public class Aeroplan extends Toy implements ElectronicDevice{

	@Override
	public void move(){
		System.out.println(this + " moving... ");
	}
	
	@Override
	public void on(){
		System.out.println(this + " On... ");
	}
	@Override
	public void off(){
		System.out.println(this + " off.... ");
	}
	
}