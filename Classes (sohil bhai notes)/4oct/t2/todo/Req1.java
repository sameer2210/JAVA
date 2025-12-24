
public class Req1 {

	public static void main(String[] args) {
		Fan fan  = new Fan();
		FanRegulator r  = new 	FanRegulator();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		
		r.attached(fan);
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.disAttached();
		r.regulate();
		r.regulate();
		r.regulate();
		
		
	}

}
