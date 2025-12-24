public abstract class Bike {
	
	public void start() {
		System.out.println(this +" stared...");
	}
	
	public void run() {
		System.out.println(this +" running...");
	}
	public void stop() {
		System.out.println(this +" Stoped...");
	}
	
	public void fillFuel() {
		System.out.println(this +"open cap fill then close cap...");
	}
	
	 
	public abstract void brake();
}
