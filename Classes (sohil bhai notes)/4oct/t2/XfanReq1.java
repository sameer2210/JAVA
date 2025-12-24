public class XfanReq1 {
	public static void main(String args[]){

		Xfan fan = new Xfan();
		XfanRegulator r = new XfanRegulator();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		System.out.println("___________________");
		
		r.attached(fan);
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		System.out.println("___________________");
	
		r.disAttached();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();
		r.regulate();


		}//end main
}//end class