  
public class Laptop extends Device {
	void on(){
		super.on();
			load();
	}
	
	private void load(){
		System.out.println("loading os.... ");
	}
	
}//end class
		